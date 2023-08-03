package Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.menu.MenuController;
import Controller.user.user_delete;
import Controller.user.user_insert;
import Controller.user.user_select;
import Controller.user.user_select_all;
import Controller.user.user_update;
import Controller.user.auth.LoginController;
import Controller.user.auth.LogoutController;



public class FrontController extends HttpServlet {

    private Map<String, SubController> map = new HashMap<>();
    // 초기값 설정
    // 사용자 요구사항API Controller에 맞게 저장
    // 
    
    
    @Override
    public void init(ServletConfig config) throws ServletException {

        String projectPath = config.getServletContext().getContextPath();

        // user
        map.put(projectPath + "/user/join.do", new user_insert());
        map.put(projectPath + "/user/selectAll.do", new user_select_all());
        map.put(projectPath + "/user/select.do", new user_select());
        map.put(projectPath + "/user/update.do", new user_update());
        map.put(projectPath + "/user/delete.do", new user_delete());

        //menu
        map.put(projectPath + "/menu/insert.do", new MenuController());
        map.put(projectPath + "/menu/selectAll.do", new MenuController());
        map.put(projectPath + "/menu/select.do", new MenuController());
        map.put(projectPath + "/menu/keywordSelect.do", new MenuController());
        map.put(projectPath + "/menu/delete.do", new MenuController());
        map.put(projectPath + "/menu/update.do", new MenuController());
        map.put(projectPath + "/menu/delete.do", new MenuController());

        //Order
//        map.put(projectPath + "/order/insert.do", new OrderController());
//        map.put(projectPath + "/order/selectAll.do", new OrderController());
//        map.put(projectPath + "/order/select.do", new OrderController());
//        map.put(projectPath + "/order/update.do", new OrderController());
//        map.put(projectPath + "/order/delete.do", new OrderController());

        map.put(projectPath + "/main.do", new MainController());
        map.put(projectPath + "/login.do", new LoginController());
        map.put(projectPath + "/logout.do", new LogoutController());

    }


 
   
    

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        synchronized (map) {
            // 요청된 URI에서 세션 ID를 제거합니다.
            String requestURI = req.getRequestURI();
            String sessionIdPattern = ";jsessionid=[^?]*"; // 세션 ID를 제거하기 위한 정규식 패턴
            requestURI = requestURI.replaceAll(sessionIdPattern, ""); // 세션 ID가 포함된 부분을 제거
            System.out.println("FrontController's Service uri : " + requestURI);

            SubController controller = map.get(requestURI);
            controller.execute(req, resp);
        }
    }
}
