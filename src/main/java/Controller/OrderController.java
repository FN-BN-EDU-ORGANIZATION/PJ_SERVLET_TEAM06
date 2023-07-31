package Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Domain.Dto.OrderDto;
import Domain.Service.OrderService;
import Domain.Service.OrderServiceImpl;

public class OrderController implements SubController{

	private OrderService service;
	


	public OrderController() {
		service= OrderServiceImpl.getInstance();
	}


	// 1 Select, 2 Insert, 3 Update 4 Delete
	@Override
	public Map<String, Object> execute(int serviceNo, Map<String, Object> param) {
		// 주문 전체 조회
				if (serviceNo == 1) {
					List<OrderDto> list = null;
					try {
						list = service.getOrder();
					} catch (Exception e) {
					
						e.printStackTrace();
					}
					System.out.println("Menu_Select All Block!");
					Map<String,Object>result = new HashMap();
					result.put("result", list);
					return result;
			}	// 주문 단건 조회
				else if (serviceNo == 2) {
					String sid = (String)param.get("sid");
					Integer order_id = (int)param.get("order_id");
					
					if(sid==null||order_id==null) {
						System.out.println("[ERROR] Data Validation Check Error");
						return null;
					}
					
					OrderDto dto = null;
					try {
						dto =service.getOrder(order_id);
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					Map<String,Object>result = new HashMap();
					result.put("result", dto);
					return result;
				}
				// 주문하기
				else if (serviceNo == 3) {
				// 1 파라미터 추출
				Integer order_id = (Integer) param.get("order_id");
				String id = (String) param.get("user_id");
				Integer menu_id = (Integer) param.get("menu_id");
				String menu_name = (String) param.get("menu_name");
				String addr = (String) param.get("addr");
				Integer amount = (Integer) param.get("amount");
				Integer price = (Integer) param.get("price");
				String role=(String) param.get("role");
				
				// 2 입력값 검증
				if(id==null||menu_id==null||amount==null) {
					System.out.println("[ERROR]Data Validation Check Error");
					return null;
				}
				// 3 서비스 실행
				OrderDto dto = new OrderDto(order_id,id,menu_id,menu_name,addr,amount,null,price);
				System.out.println("Dto : " + dto);
			
				Boolean rValue=false;
				try {
					rValue = service.reqOrder(role,id, menu_id,amount);
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// 4 View로 전달
				System.out.println("Order_insert Block!");
				Map<String,Object> result = new HashMap();
				result.put("result", rValue);
				return result;
			
				// 주문 수정
		} else if (serviceNo == 4) {
			// 1 파라미터 추출
			Integer order_id = (Integer) param.get("order_id");
			String user_id = (String) param.get("member_id");
			Integer amount = (Integer) param.get("amount");
			Integer price = (Integer) param.get("price");
			String role=(String) param.get("role");
			
			// 2 입력값 검증
					if(user_id==null||amount==null||order_id==null) {
						System.out.println("[ERROR]Data Validation Check Error");
						return null;
					}
					
					
					// 3 서비스 실행
				
					OrderDto dto = new OrderDto(order_id,user_id,amount,price);
					
					Boolean rValue=false;
					try {
						rValue=service.updateOrder(dto,role);
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					
					System.out.println("Product_Add Block!");
					Map<String,Object>result= new HashMap();
					result.put("result", rValue);
					return result;
					
					// 주문 삭제
		} else if (serviceNo == 5) {
			// 1 파라미터 추출
			Integer order_id = (Integer)param.get("order_id");
			String role=(String) param.get("role");
			if(order_id==null || role == null) {
				System.out.println("[ERROR]Data Validation Check Error");
				return null;
			}
			Boolean rValue = false;
			try {
				rValue=service.removeOrder(role,order_id);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			Map<String,Object> result = new HashMap();
			result.put("result", rValue);
			return result;
		}
		return null;
		}
		}