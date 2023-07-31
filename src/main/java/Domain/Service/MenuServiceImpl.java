package Domain.Service;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import Domain.Dao.MenuDao;
import Domain.Dao.MenuDaoImpl;
import Domain.Dto.MenuDto;
import Domain.Service.Auth.Session;

public class MenuServiceImpl implements MenuService {
	private MenuDao dao;

	// 싱글톤
	private static MenuService instance;

	public static MenuService getInstance() {
		if (instance == null)
			instance = new MenuServiceImpl();
		return instance;
	}

	private UserService userService;

	private MenuServiceImpl() {
		dao = MenuDaoImpl.getInstance();
		userService = UserServiceImpl.getInstance();
	}

	// 메뉴 조회하기(비회원/회원/사서)
	@Override
	public List<MenuDto> getAllMenu() throws Exception {
		System.out.println("MenuService's getAllBook()");
		List<MenuDto> result = (List<MenuDto>) dao.selectMenu();
		return dao.selectMenu();
	}

	@Override
	public MenuDto getMenu(int menu_id) throws Exception {
		System.out.println("BookService's getBook()");
		return dao.selectMenu(menu_id);
	}

	// 메뉴 등록하기(관리자)
	@Override
	public boolean addMenu(MenuDto dto, String sid) throws Exception {
		System.out.println("BookService's addBook()");

		String role = userService.getRole(sid);
		if (role.equals("ROLE_RES")) {
			int result = dao.insertMenu(dto);
			if (result > 0)
				return true;
		}
		return false;
	}

	// 메뉴 수정하기
	@Override
	public boolean updateMenu(MenuDto dto, String sid) throws Exception {
		System.out.println("BookService's updateBook()");

		String role = userService.getRole(sid);
		if (role.equals("ROLE_RES")) {
			int result = dao.updateMenu(dto);
			if (result > 0)
				return true;
		}
		return false;
	}

	// 메뉴 삭제하기
	@Override
	public boolean deleteMenu(int menu_id, String sid) throws Exception {
		System.out.println("BookService's updateBook()");

		String role = userService.getRole(sid);
		if (role.equals("ROLE_RES")) {
			int result = dao.deleteMenu(menu_id);
			if (result > 0)
				return true;
		}
		return false;
	}

}
