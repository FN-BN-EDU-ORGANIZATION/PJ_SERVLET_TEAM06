package Domain.Common.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletRequest;

import Domain.Common.Dao.MenuDao;
import Domain.Common.Dao.MenuDaoImpl;
import Domain.Common.Dao.OrderDao;
import Domain.Common.Dao.OrderDaoImpl;
import Domain.Common.Dao.UserDao;
import Domain.Common.Dao.UserDaoImpl;
import Domain.Common.Dto.MenuDto;
import Domain.Common.Dto.OrderDto;
import Domain.Common.Dto.UserDto;

public class OrderServiceImpl implements OrderService {

	private UserService userService;
	private MenuService menuService;
	private OrderDao oDao;
	private UserDao uDao;
	private MenuDao mDao;
	private static OrderService instance;

	public static OrderService getInstance() 
	{
		if (instance == null) 
		{
			instance = new OrderServiceImpl();
		}
		return instance;
	}

	public OrderServiceImpl() {
		oDao = OrderDaoImpl.getInstance();
		uDao = UserDaoImpl.getInstance();
		mDao = MenuDaoImpl.getInstance();
		userService = UserServiceImpl.getInstance();
		menuService = MenuServiceImpl.getInstance();
	}

	// 상품 주문하기
	@Override
	public boolean reqOrder(String sid, String id, int menu_id, int amount) throws Exception {
		UserDto udto = new UserDto();
		MenuDto mdto = new MenuDto();
		OrderDto odto = new OrderDto();
		AtomicInteger uniqueOrderId = new AtomicInteger(); // 신규 코드: 정수 값으로 주문 ID 생성

		String role = sid;
		if (!role.equals("ROLE_USER")) {
			System.out.println("[WARN] 회원만 주문 할 수 있습니다.");
			return false;
		}

	    udto = userService.userSearchOne(role, id);
	    if (udto != null) {
	        mdto = menuService.getMenu(menu_id);
	        if (mdto != null) {
	            int mp = amount * mdto.getPrice();
	            int oid = uniqueOrderId.incrementAndGet(); 
	            odto.setOrder_id(oid); // 주문 ID 설정
	            odto.setid(id);

	            // insert 여부를 확인하는 코드
	            int insertSuccess = oDao.insert(new OrderDto(oid, udto.getId(), mdto.getid(),
	                    mdto.name(), udto.getAddr(), amount,null, mp));

	            // insert 가 무사히 되었을시 true값을 리턴
	            if (insertSuccess==1) {
	                System.out.println("[INFO] 주문완료");
	                return true;

	            } 
	            // insert가 되지 않았을시에 false값을 리턴
	            else {
	                System.out.println("[INFO] 주문 내역 추가 실패");
	                return false;
	            }
	        } else {
	            System.out.println("[INFO] 해당 상품이 존재하지 않습니다.");
	            return false;
	        }
	    } else {
	        System.out.println("[INFO] 해당 회원이 존재하지 않습니다.");
	        return false;
	    }
	}
		
	
	

	// 주문 전체 확인
	@Override
	public List<OrderDto> getOrder() throws Exception {
		return oDao.select();
	}

	// 주문정보 수정
	@Override
	public OrderDto getOrder(int order_id) throws Exception {
		return oDao.select(order_id);

	}

	public boolean updateOrder(OrderDto dto, String login_sid) throws Exception {

		System.out.println("OrderService's updateOrder()");
		String role = login_sid;
		if (role.equals("ROLE_RES")) {
			int result = oDao.update(dto);
			if (result > 0)
				return true;
		}
		return false;
	}

	// 주문 완료 및 취소 처리
	@Override
	public boolean removeOrder(HttpServletRequest req)  {
		System.out.println("OrderService's removeOrder()");
		String order_id = (String) req.getAttribute("order_id");
		System.out.println("전달받은 order_id : "+ order_id);
		
		if(order_id == null || order_id.isEmpty()) {
			System.out.println("[오류] 데이터 유효성 검사 오류");
			req.setAttribute("msg", "[오류] 삭제할 수 없는 정보입니다.");
			return false;
		}
		try {
	        int result = oDao.delete(order_id);
	        if (result > 0) {
	            return true;
	        } else {
	            // 주문 정보 삭제에 실패한 경우에 대한 로그를 남기고 예외 메시지를 출력
	            System.out.println("Failed to delete order from removeOrder: " + order_id);
	            throw new Exception("주문 정보 삭제에 실패했습니다.");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		return false;
	}

}
