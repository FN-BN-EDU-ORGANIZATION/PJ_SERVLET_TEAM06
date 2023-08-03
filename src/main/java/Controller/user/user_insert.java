package Controller.user;

import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SubController;
import Domain.Common.Dto.UserDto;
import Domain.Common.Service.UserService;
import Domain.Common.Service.UserServiceImpl;


public class user_insert implements SubController {

	private UserService service = UserServiceImpl.getInstance();

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("User_Insert execute");

		try {
			if (req.getMethod().equals("GET")) {
				req.setAttribute("msg", "");
				req.getRequestDispatcher("./join.jsp").forward(req, resp);
				return;
			}} catch (Exception e) {
				e.printStackTrace();
			}
			// 01 파라미터
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			String name = req.getParameter("name");
			String addr = req.getParameter("addr");
			String phone = req.getParameter("phone");

			try {
			// 03 서비스
			UserDto dto = new UserDto();
			dto.setId(id);
			dto.setPw(pw);
			dto.setName(name);
			dto.setAddr(null);
			dto.setPhone(phone);
			
			boolean isjoin = service.UserJoin(dto);
			//04 뷰로 이동
			if(isjoin) {
				resp.sendRedirect(req.getContextPath()+"/login.do");
				
			}else {
				req.setAttribute("msg", "회원가입 실패...");
				req.getRequestDispatcher("./join.jsp").forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

