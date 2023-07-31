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

		System.out.println("BookDeleteController execute");
		Integer menu_id = (Integer) req.get("menu_id");
		String sid = (String) req.get("sid");
		// 입력값검증
		if (menu_id == null) {
			System.out.println("[ERROR] Data Validation Check Error!");
			return null; // 함수종료
		}
		// 서비스 실행
		Boolean rValue = false;
		try {
			rValue = service.deleteMenu(menu_id, sid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// View로 전달
		System.out.println("Menu_Update Block");
		Map<String, Object> result = new HashMap<>();
		result.put("result", rValue);
		return result;
	}

	

	
	}

