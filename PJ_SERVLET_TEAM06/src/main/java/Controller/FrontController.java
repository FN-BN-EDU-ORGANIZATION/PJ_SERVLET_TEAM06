package Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.menu.MenuAddController;
import Controller.menu.MenuDeleteController;
import Controller.menu.MenuSearchController;
import Controller.menu.MenuUpdateController;
import Controller.order.OrderAddController;
import Controller.order.OrderDeleteController;
import Controller.order.OrderSearchController;
import Controller.order.OrderUpdateController;
import Controller.user.UserAddController;
import Controller.user.UserDeleteController;
import Controller.user.UserSearchController;
import Controller.user.UserUpdateController;
import Controller.user.auth.LoginController;

public class FrontController extends HttpServlet {

	private Map<String, SubController> map = new HashMap<>();

	@Override
	public void init(ServletConfig config) throws ServletException {
		String projectPath = config.getServletContext().getContextPath(); 

		map.put(projectPath + "/menu/search.do", new MenuSearchController()); 
		map.put(projectPath + "/menu/add.do", new MenuAddController());
		map.put(projectPath + "/menu/update.do", new MenuUpdateController());
		map.put(projectPath + "/menu/delete.do", new MenuDeleteController());

		map.put(projectPath + "/order/search.do", new OrderSearchController()); 
		map.put(projectPath + "/order/add.do", new OrderAddController());
		map.put(projectPath + "/order/update.do", new OrderUpdateController());
		map.put(projectPath + "/order/delete.do", new OrderDeleteController());
		
		map.put(projectPath + "/user/search.do", new UserSearchController()); 
		map.put(projectPath + "/user/add.do", new UserAddController());
		map.put(projectPath + "/user/update.do", new UserUpdateController());
		map.put(projectPath + "/user/delete.do", new UserDeleteController());
	
		//user.auth
		map.put(projectPath+"/login.do", new LoginController());
//		map.put(projectPath+"/logout.do", new LogoutController());
		
		//main
		map.put(projectPath+"main.do",new MainController());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("FrontController's service Uri : " + req.getRequestURI());//

		SubController controller = map.get(req.getRequestURI());
		controller.execute(req, resp);
	}

}
