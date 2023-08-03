package Controller.user.auth;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.SubController;
import Domain.Common.Service.UserService;
import Domain.Common.Service.UserServiceImpl;

public class LogoutController implements SubController{

	private UserService service= UserServiceImpl.getInstance();

	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("LogoutController execute");
		try {
			HttpSession session = req.getSession();
			session.invalidate();
			resp.sendRedirect(req.getContextPath()+"/main.do");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
