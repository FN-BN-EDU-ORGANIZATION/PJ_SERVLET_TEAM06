package Controller.order;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SubController;
import Domain.Common.Service.OrderService;
import Domain.Common.Service.OrderServiceImpl;

public class OrderSearchController implements SubController{
	private OrderService service= OrderServiceImpl.getInstance();


	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

}
