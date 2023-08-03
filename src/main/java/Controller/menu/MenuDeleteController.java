package Controller.menu;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SubController;
import Domain.Common.Service.MenuService;
import Domain.Common.Service.MenuServiceImpl;

public class MenuDeleteController implements SubController {
	private MenuService service = MenuServiceImpl.getInstance();

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {

	}

}
