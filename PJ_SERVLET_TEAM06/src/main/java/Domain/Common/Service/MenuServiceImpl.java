package Domain.Common.Service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import Domain.Common.Dao.MenuDao;
import Domain.Common.Dao.MenuDaoImpl;
import Domain.Common.Dto.MenuDto;

public class MenuServiceImpl implements MenuService {
	private MenuDao dao;
	private UserService userService;

	// 싱글톤
	private static MenuService instance;
	public static MenuService getInstance() {
		if (instance == null)
			instance = new MenuServiceImpl();
		return instance;
	}


	private MenuServiceImpl() {
		dao = new MenuDaoImpl();
		userService = UserServiceImpl.getInstance();
	}

	// 메뉴 조회하기(비회원/회원/사서)
	@Override
	public List<MenuDto> getAllMenu(HttpServletRequest req) throws Exception {
		System.out.println("MenuService's getAllMenu()");
		return dao.selectMenu();
	}

	@Override
	public MenuDto getMenu(int menu_id) throws Exception {
		System.out.println("MenuService's getMenu()");
		return dao.selectMenu(menu_id);
	}

	// 메뉴 등록하기(관리자)
	@Override
	public boolean addMenu(MenuDto dto, String id) throws Exception {
		System.out.println("MenuService's addMenu()");
		String role = id;
		if (role.equals("ROLE_RES")) {
			int result = dao.insertMenu(dto);
			if (result > 0)
				return true;
		}
		return false;
	}

	// 메뉴 수정하기
	@Override
	public boolean updateMenu(MenuDto dto, String id) throws Exception {
		System.out.println("MenuService's updateMenu()");
		String role = id;
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
		System.out.println("MenuService's deleteMenu()");
		String role = sid;
		if (role.equals("ROLE_RES")) {
			int result = dao.deleteMenu(menu_id);
			if (result > 0)
				return true;
		}
		return false;
	}

}
