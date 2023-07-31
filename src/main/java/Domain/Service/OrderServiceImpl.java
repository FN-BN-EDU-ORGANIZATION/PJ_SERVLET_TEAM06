package Domain.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import Domain.Dao.MenuDao;
import Domain.Dao.MenuDaoImpl;
import Domain.Dao.OrderDao;
import Domain.Dao.OrderDaoImpl;
import Domain.Dao.UserDao;
import Domain.Dao.UserDaoImpl;
import Domain.Dto.MenuDto;
import Domain.Dto.OrderDto;
import Domain.Dto.UserDto;

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
	            odto.setMenu_id(menu_id);

	            // insert 여부를 확인하는 코드
	            int insertSuccess = oDao.insert(new OrderDto(oid, udto.getId(), mdto.getMenu_id(),
	                    mdto.getMenu_name(), udto.getAddr(), amount,null, mp));

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
	public boolean removeOrder(String sid, int order_id) throws Exception {
		System.out.println("OrderService's removeOrder()");
		String role = sid;
		if (role.equals("ROLE_RES")) {
			int result = oDao.delete(order_id);
			if (result > 0)
				return true;
			System.out.println("role : " + role);

		}
		return false;
	}

}
