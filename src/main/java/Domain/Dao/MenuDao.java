package Domain.Dao;

import java.util.List;


import Domain.Dto.MenuDto;

public interface MenuDao {

	int insertMenu(MenuDto dto) throws Exception;

	List<MenuDto> selectMenu() throws Exception;

	MenuDto selectMenu(int menu_id) throws Exception;
	
	List<MenuDto> selectMenu(String keyword);
	
	List<MenuDto> selectMenu(String keyfield, String keyword);	
	
	int updateMenu(MenuDto dto) throws Exception;

	int deleteMenu(int menu_id) throws Exception;


}