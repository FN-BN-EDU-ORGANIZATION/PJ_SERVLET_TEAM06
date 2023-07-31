package Controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SubController;
import Domain.Common.Service.UserService;
import Domain.Common.Service.UserServiceImpl;

public class UserSearchController implements SubController{
	private UserService service= UserServiceImpl.getInstance();


	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

}
