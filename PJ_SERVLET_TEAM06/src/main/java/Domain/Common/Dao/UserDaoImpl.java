package Domain.Common.Dao;

import java.util.ArrayList;
import java.util.List;

import Domain.Common.Dto.UserDto;

public class UserDaoImpl extends ConnectionPool implements UserDao {

	// 싱글톤
	private static UserDaoImpl instance;

	public static UserDaoImpl getInstance() {
		if (instance == null)
			instance = new UserDaoImpl();
		return instance;
	}

	public UserDaoImpl() {
		super();
	}

	@Override
	public int insert(UserDto dto) {

		try {
			pstmt = conn.prepareStatement("insert into tbl_user values(?,?,?,?,?,?)");
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getPhone());
			pstmt.setString(5, dto.getAddr());
			pstmt.setString(6, dto.getRole());
			int result = pstmt.executeUpdate();
			pstmt.close();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<UserDto> selectAll(){
		List<UserDto> list = new ArrayList();
		UserDto dto = null;
		try {
		pstmt = conn.prepareStatement("select * from tbl_user");
		rs = pstmt.executeQuery();
		if (rs != null) 
		{
			while (rs.next()) 
			{
				dto = new UserDto();
				dto.setId(rs.getString("id"));
				dto.setPw(null);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				dto.setPhone(rs.getString("phone"));
				dto.setRole(rs.getString("role"));
				list.add(dto);
			}
		}
			rs.close();
			pstmt.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public UserDto select(String id) {

		UserDto dto = null;
		try {
			pstmt = conn.prepareStatement("select * from tbl_user where id = ?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs != null) {
				while (rs.next()) {

					dto = new UserDto();
					dto.setId(rs.getString("id"));
					dto.setPw(rs.getString("pw"));
					dto.setName(rs.getString("name"));
					dto.setPhone(rs.getString("phone"));
					dto.setAddr(rs.getString("addr"));
					dto.setRole(rs.getString("role"));
				}
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

	// 수정 시발
	@Override
	public int update(UserDto dto) {
		try {
			pstmt = conn.prepareStatement("update tbl_user set pw=?,name=?, addr=?,phone=?, role=? where id=?");
			pstmt.setString(1, dto.getPw());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getAddr());
			pstmt.setString(5, dto.getRole());
			pstmt.setString(6, dto.getId());

			int result = pstmt.executeUpdate();
			pstmt.close();

			return result;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	// 삭제 시
	@Override
	public int delete(String id) {
		try {
			pstmt = conn.prepareStatement("delete from tbl_user where id =?");
			pstmt.setString(1, id);

			int result = pstmt.executeUpdate();
			pstmt.close();
			return result;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}

}
