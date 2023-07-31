package Domain.Common.Dao;

import java.util.ArrayList;
import java.util.List;

import Domain.Common.Dto.MenuDto;

public class MenuDaoImpl extends ConnectionPool implements MenuDao {

	// 싱글톤 패턴
	private static MenuDaoImpl instance;

	public static MenuDaoImpl getInstance() {
		if (instance == null)
			instance = new MenuDaoImpl();
		return instance;
	}

	public MenuDaoImpl() {

	}

	@Override
	public int insertMenu(MenuDto dto) throws Exception {
		pstmt = conn.prepareStatement("INSERT INTO tbl_menu VALUES (?,?,?,?,?,?)");
		pstmt.setInt(1, dto.getId());
		pstmt.setString(2, dto.getName());
		pstmt.setString(3, dto.getPhoto_url());
		pstmt.setString(4, dto.getSharp_tag());
		pstmt.setString(5, dto.getDescription());
		pstmt.setInt(6, dto.getPrice());
		int result = pstmt.executeUpdate();
		pstmt.close();
		
		return result;
	}

	@Override
	public List<MenuDto> selectMenu() throws Exception {
		List<MenuDto> menuList = new ArrayList();
		MenuDto dto = null;
		pstmt = conn.prepareStatement("SELECT * FROM tbl_menu");
		rs = pstmt.executeQuery();
		if (rs != null) 
		{
			while (rs.next()) {
				dto = new MenuDto();
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				// 테이블에서 사용 가능한 경우 menuDto의 다른 속성을 설정합니다.
				menuList.add(dto);
			}
			rs.close();
		}
		pstmt.close();

		return menuList;
	}

	@Override
	public MenuDto selectMenu(int id) throws Exception {
		
		MenuDto dto = null;
		pstmt = conn.prepareStatement("select * from tbl_menu where id=?");
		pstmt.setInt(1, id);
		rs = pstmt.executeQuery();
		if (rs != null && rs.isBeforeFirst()) 
		{
			rs.next();
			dto = new MenuDto();
			dto.setId(rs.getInt("id"));
			dto.setName(rs.getString("name"));
			dto.setPrice(rs.getInt("price"));
			
			rs.close();
			
		}
		pstmt.close();
		return dto;
	}
	
	
	@Override
	public List<MenuDto> selectMenu(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<MenuDto> selectMenu(String keyfield, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int updateMenu(MenuDto dto) throws Exception {
		pstmt = conn.prepareStatement("UPDATE tbl_menu SET name=?, price=? WHERE id=?");
		pstmt.setString(1, dto.getName());
		pstmt.setInt(2, dto.getPrice());
		pstmt.setInt(3, dto.getId());
		int result = pstmt.executeUpdate();
		pstmt.close();

		return result;
	}

	@Override
	public int deleteMenu(int id) throws Exception {
		pstmt = conn.prepareStatement("DELETE FROM tbl_menu WHERE id=?");
		pstmt.setInt(1, id);
		int result = pstmt.executeUpdate();
		pstmt.close();
		return result;
	}



}
