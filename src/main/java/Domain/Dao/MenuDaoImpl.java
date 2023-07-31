package Domain.Dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Domain.Dto.MenuDto;

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
		pstmt = conn.prepareStatement("INSERT INTO tbl_menu VALUES (?,?,?)");
		pstmt.setInt(1, dto.getMenu_id());
		pstmt.setString(2, dto.getMenu_name());
		pstmt.setInt(3, dto.getPrice());
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
				dto.setMenu_id(rs.getInt("menu_id"));
				dto.setMenu_name(rs.getString("menu_name"));
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
	public MenuDto selectMenu(int menu_id) throws Exception {
		
		MenuDto dto = null;
		pstmt = conn.prepareStatement("select * from tbl_menu where menu_id=?");
		pstmt.setInt(1, menu_id);
		rs = pstmt.executeQuery();
		if (rs != null && rs.isBeforeFirst()) 
		{
			rs.next();
			dto = new MenuDto();
			dto.setMenu_id(rs.getInt("menu_id"));
			dto.setMenu_name(rs.getString("menu_name"));
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
		pstmt = conn.prepareStatement("UPDATE tbl_menu SET menu_name=?, price=? WHERE menu_id=?");
		pstmt.setString(1, dto.getMenu_name());
		pstmt.setInt(2, dto.getPrice());
		pstmt.setInt(3, dto.getMenu_id());
		int result = pstmt.executeUpdate();
		pstmt.close();

		return result;
	}

	@Override
	public int deleteMenu(int menu_id) throws Exception {
		pstmt = conn.prepareStatement("DELETE FROM tbl_menu WHERE menu_id=?");
		pstmt.setInt(1, menu_id);
		int result = pstmt.executeUpdate();
		pstmt.close();
		return result;
	}



}
