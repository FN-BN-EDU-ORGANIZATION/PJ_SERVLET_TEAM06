package Domain.Service;

import java.util.List;

import Domain.Dto.OrderDto;

public interface OrderService {

	// 
	boolean reqOrder(String sid,String id, int menu_id, int amount)throws Exception;
	
	// 주문 전체 확인
	List<OrderDto> getOrder() throws Exception;
	
	//건별 주문 확인
	OrderDto getOrder(int order_id) throws Exception;
	
	
	
	// 주문정보 수정
	boolean updateOrder(OrderDto dto, String login_sid) throws Exception;
	
	// 주문 완료 및 취소 처리
	boolean removeOrder(String sid, int order_id) throws Exception;

	
	
}
