package User;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Domain.Dao.UserDao;
import Domain.Dao.UserDaoImpl;
import Domain.Dto.UserDto;
import Domain.Service.UserService;
import Domain.Service.UserServiceImpl;

/**
 * Servlet implementation class Login
 */

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService;
	public Map<String,HttpSession> sessionMap;
       
	public void init() throws ServletException {
		userService = UserServiceImpl.getInstance();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 입력한 아이디와 비밀번호 추출
        String user_id = request.getParameter("id");
        String pw = request.getParameter("pw");
        UserDao dao = new UserDaoImpl();
        UserDto dto =  dao.select(user_id);
        // DB에서 해당 사용자 조회
        
         
		Map<String, Object> result = new HashMap();
		try {
			result = userService.login(request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		String sid = (String)result.get("sid");
		String role = (String)result.get("role");
		
         
		
        if (dao != null) {
            // 사용자가 존재하는 경우
            if (dto.getId().equals(user_id)) {
                // 비밀번호가 일치하는 경우, 로그인 성공 처리
                // 세션에 사용자 정보 및 로그인 상태 저장
                HttpSession session = request.getSession();
                session.setAttribute("user_id", user_id);
                session.setAttribute("role", role);
                session.setAttribute("loggedIn", true);
				/* response.sendRedirect("/WEB-INF/view/Main.jsp?role=" + role); */
                response.sendRedirect("/WEB-INF/view/Main.jsp");
                
                System.out.println("Session ID: " + session);
                System.out.println("user ID: " + user_id);
                System.out.println("Role: " + role);
  
            } else {
                // 비밀번호가 일치하지 않는 경우, 로그인 실패 처리
                response.sendRedirect("/WEB-INF/view/Main.jsp?error=invalid_password");
            }
        } else {
            // 사용자가 존재하지 않는 경우, 로그인 실패 처리
            response.sendRedirect("/WEB-INF/view/login.jsp?error=invalid_username");
        }

	}
}
