package Controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import Domain.Dto.MenuDto;
import Domain.Service.MenuService;
import Domain.Service.MenuServiceImpl;

public class MenuController implements SubController {

	private MenuService menuService;

	public MenuController() {
		menuService = MenuServiceImpl.getInstance();
	}

	// 1 매장추가2 메뉴추가, 3 주문하기 4 주문내역확인
	@Override
	public Map<String, Object> execute(int serviceNo, Map<String, Object> param) {

		if (serviceNo == 1) {
			// 1 파라미터 추출(생략)
			// 2 입력값 검증(생략)
			// 3 서비스 실행(서비스모듈작업 이후 처리)
			List<MenuDto> list = null;
			try {
				list = menuService.getAllMenu();
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 4 View로 전달
			System.out.println("Menu_Select Block");
			Map<String, Object> result = new HashMap();
			result.put("result", list);
			return result;

		} else if (serviceNo == 2) {
			// 파라미터 추출
			Integer menu_id = (Integer) param.get("menu_id");
			String menu_name = (String) param.get("menu_name");
			Integer price = (Integer) param.get("price");
			String sid = (String) param.get("sid");
			// 입력값검증
			if (menu_id == null || menu_name == null || price == null) {
				System.out.println("[ERROR] Data Validation Check Error!");
				return null; // 함수종료
			}
			// 서비스 실행
			MenuDto dto = new MenuDto(menu_id, menu_name, price);
			System.out.println("Dto : " + dto);

			Boolean rValue = false;
			try {
				rValue = menuService.addMenu(dto, sid);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// View로 전달
			System.out.println("Menu_Insert Block");
			Map<String, Object> result = new HashMap<>();
			result.put("result", rValue);
			return result;
		} else if (serviceNo == 3) {
			// 파라미터 추출
			Integer menu_id = (Integer) param.get("menu_id");
			String menu_name = (String) param.get("menu_name");
			Integer price = (Integer) param.get("price");
			String sid = (String) param.get("sid");
			// 입력값검증
			if (menu_id == null || menu_name == null || price == null) {
				System.out.println("[ERROR] Data Validation Check Error!");
				return null; // 함수종료
			}
			// 서비스 실행
			MenuDto dto = new MenuDto(menu_id, menu_name, price);
			System.out.println("Dto : " + dto);

			Boolean rValue = false;
			try {
				rValue = menuService.updateMenu(dto, sid);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// View로 전달
			System.out.println("Menu_Update Block");
			Map<String, Object> result = new HashMap<>();
			result.put("result", rValue);
			return result;
		}else if (serviceNo == 4) {
			// 파라미터 추출
			Integer menu_id = (Integer) param.get("menu_id");
			String sid = (String) param.get("sid");
			// 입력값검증
			if (menu_id == null) {
				System.out.println("[ERROR] Data Validation Check Error!");
				return null; // 함수종료
			}
			// 서비스 실행
			Boolean rValue = false;
			try {
				rValue = menuService.deleteMenu(menu_id, sid);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// View로 전달
			System.out.println("Menu_Update Block");
			Map<String, Object> result = new HashMap<>();
			result.put("result", rValue);
			return result;
		}
		return null;
	}
}
