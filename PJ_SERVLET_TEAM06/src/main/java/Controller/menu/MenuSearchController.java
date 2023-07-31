package Controller.menu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SubController;
import Domain.Common.Service.MenuService;
import Domain.Common.Service.MenuServiceImpl;

public class MenuSearchController implements SubController {
	private MenuService service= MenuServiceImpl.getInstance();

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("MenuDeleteCtroller execute");
	}

	

}
