package Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Domain.Dto.UserDto;
import Domain.Service.UserService;
import Domain.Service.UserServiceImpl;

public class UserController implements SubController {

	private UserService userService;

	public UserController() {
		userService = UserServiceImpl.getInstance();
	}

	// 1 회원조회(전체) 2 회원가입 3 회원수정 4 회원삭제 5 로그인 6 로그아웃 7 역할가져오기
	public Map<String, Object> execute(int serviceNo, Map<String, Object> param) {
		
		if (serviceNo == 1) {
			// 1 파라미터 추출(생략)
			String sid = (String) param.get("sid");
			// 2 입력값 검증(생략)

			// 3 서비스 실행(서비스 모듈작업 이후 처리 )	
		
			List<UserDto> list = null;
			try {
				list = userService.userSearch(sid);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (serviceNo == 2) {
			// 파라미터 추출
			String id = (String) param.get("id");
			String pw = (String) param.get("pw");
			String name = (String) param.get("name");
			String addr = (String) param.get("addr");
			String phone = (String) param.get("phone");
			String role = (String) param.get("role");

			// 입력값검증
			if (id == null || pw == null || name == null || addr == null || phone == null || role == null) {
				System.out.println("[ERROR] Data Validation Check Error!");
				return null;
			}
			// 서비스 실행
			UserDto dto = new UserDto(id, pw, name, addr, phone, role);
			System.out.println("Dto : " + dto);
			Boolean rValue = false;
			try {
				rValue = userService.UserJoin(dto);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// View전달
			System.out.println("User_Insert Block");
			Map<String, Object> result = new HashMap<>();
			result.put("result", rValue);
			return result;

		} else if (serviceNo == 3) {
			// 1 파라미터 추출
			String id = (String) param.get("id");
			String pw = (String) param.get("pw");
			String name = (String) param.get("name");
			String addr = (String) param.get("addr");
			String phone = (String) param.get("phone");
			String role = (String) param.get("role");
			String sid = (String)param.get("sid");
			// 2 입력값 검증
			if (id == null || pw == null || name == null || addr == null || phone == null || role == null) {
				System.out.println("[ERROR] Data Validation Check Error");
				return null;
			}
			// 3 서비스 실행
			UserDto dto = new UserDto(id, pw, name, addr, phone, role);
			System.out.println("Dto : " + dto);

			Boolean rValue = false;
			try {
				rValue = userService.UserUpdate(dto, sid);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// 4 View로 전달
			System.out.println("User_Update Block");
			Map<String, Object> result = new HashMap<>();
			result.put("result", rValue);
			return result;
		}
		else if(serviceNo == 4) {
			// 1 파라미터 추출
			String id = (String) param.get("id");
			String pw = (String) param.get("pw");
			String sid = (String) param.get("sid");
			// 2 입력값 검증
			if (id == null || pw == null ) {
				System.out.println("[ERROR] Data Validation Check Error");
				return null;
			}
			// 3 서비스 실행
			
			Boolean rValue = false;
			try {
				rValue = userService.UserDelete(id, sid);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return null;

	}

	 @Override
	    public void execute(HttpServletRequest req, HttpServletResponse resp) {
	        // GET 요청 처리
	        if (req.getMethod().equals("GET")) {
	            // 여기서 GET 요청에 대한 처리를 구현해주면 됩니다.
	            // 예를 들어, 사용자 전체 리스트를 조회하는 기능을 구현하거나,
	            // 사용자 상세 정보를 조회하는 기능을 구현할 수 있습니다.
	            // 예시:
	            String sid = req.getParameter("sid");
	            try {
	                List<UserDto> userList = userService.userSearch(sid);
	                // userList를 적절한 뷰로 전달하면 됩니다.
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
    
	}

}
