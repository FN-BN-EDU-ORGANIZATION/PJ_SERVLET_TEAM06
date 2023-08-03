package Controller.user.auth;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.SubController;
import Domain.Common.Dao.UserDaoImpl;
import Domain.Common.Dto.UserDto;
import Domain.Common.Service.UserService;
import Domain.Common.Service.UserServiceImpl;


public class LoginController implements SubController{

	private UserService service = UserServiceImpl.getInstance();
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("LoginController execute");
		
		//GET 요청 처리
		if(req.getMethod().equals("GET"))
		{
			try {
				req.getRequestDispatcher("/WEB-INF/view/member/auth/login.jsp").forward(req, resp);
				return ;
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {	
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ;
		}
		
		//POST 요청 처리
		//1 파라미터 추출
		String id = (String) req.getParameter("id");
		String pw = (String) req.getParameter("pw");
		String name = (String) req.getParameter("name");
		
		System.out.println("LoginController paramtes : " + id + " " + pw);
		
		try {
			//2 입력값 검증
			if (id.isEmpty() || pw.isEmpty()) {
				System.out.println("[ERROR] Data Validation Check Error!");
				req.setAttribute("msg", "[ERROR] ID나 PW가 공백입니다.");
				req.getRequestDispatcher("/WEB-INF/view/member/auth/login.jsp").forward(req, resp);
				return ;
			}
			//3 서비스 실행
			boolean isLogin=false;
		
			isLogin=service.login(req);
		
		
			//4 View로 전달 
			if(isLogin)
			{
				/*
				 * //main.do 이동 - Redirect resp.sendRedirect(req.getContextPath()+"/Main.do");
				 * System.out.println("로그인 성공");
				 */
				 HttpSession session = req.getSession();
				     // 또는 해당 사용자의 역할(role) 정보를 설정
				   // 또는 해당 사용자의 역할(role) 정보를 설정
				
						/* session.setAttribute("role", "sein"); */
				  session.setAttribute("id", id);
				  session.setAttribute("name", name);
				 
				  
				  
				  
				  String user_id = (String) session.getAttribute("id");
				  String user_name = (String) session.getAttribute("name");
				  String user_role = (String) session.getAttribute("role");
				  
				  List<UserDto> userList = UserDaoImpl.getInstance().selectAll();
				    for(UserDto user : userList) {
				        if(user.getId().equals(id)) {
				            session.setAttribute("name", user.getName());
				            break;
				        }
				    }
				    resp.sendRedirect(req.getContextPath() + "/main.do");
				    System.out.println("로그인 성공");
			}
			else
			{
				//login.do 이동 - Forward
				req.getRequestDispatcher("/WEB-INF/view/member/auth/login.jsp").forward(req, resp);
				System.out.println("로그인 실패");
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

}
