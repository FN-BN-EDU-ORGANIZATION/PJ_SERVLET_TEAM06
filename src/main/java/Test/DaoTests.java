//package Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import Domain.Dao.OrderDao;
//import Domain.Dao.ResDao;
//import Domain.Dao.UserDao;
//import Domain.Dto.MenuDto;
//import Domain.Dto.ResDto;
//import Domain.Dto.UserDto;
//
//
//class DaoTests {
//
//	@Test
//	public void OrderDaoTest1() {
//		OrderDao dao = new OrderDao();
//		assertNotNull(dao);
//	}
//	
//	
//	
//	//----------------------------------------------------
//	
//	@Test
//	public void ResDaoTest1() throws Exception {
//		ResDao dao = new ResDao();
//		
//		//객체연결 여부 확인 Test함수
//		assertNotNull(dao);
//		List<MenuDto> menulist = new ArrayList();
//		menulist.add(new MenuDto("1","뚝불1",10000));
//		menulist.add(new MenuDto("2","뚝불2",12000));
//		
//		ResDto dto = new ResDto();
//		dto.setRes_id("1");
//		dto.setRes_addr("인천");
//		dto.setRes_name("승하네");
//		dto.setRes_phone("053-551");
//		dto.setRes_pw("1214");
//		dto.setMenus(menulist);
//		int result = dao.insert(dto);
//		
//		
//		assertEquals(1,result);
//		
//		
//	}
//	
//	@Test
//    public void ResSelect1() throws Exception {
//        ResDao dao = ResDao.getInstance();
//        assertNotNull(dao);
//        
//        List<ResDto> resultList = dao.select();
//        assertNotNull(resultList);
//        for (ResDto dto : resultList) {
//            System.out.println("매장 아이디: " + dto.getRes_id());
//            System.out.println("매장 주소: " + dto.getRes_addr());
//            System.out.println("매장 번호: " + dto.getRes_phone());
//            System.out.println("매장 이름: " + dto.getRes_name());
//            System.out.println("매장 비밀번호: " + dto.getRes_pw());
//           
//            System.out.println("---------------");
//            
//        }
//        }
//	@Test
//	public void ResDao_update() throws Exception {
//		ResDao dao = new ResDao();
//		assertNotNull(dao);
//		int result=dao.update(new ResDto("2","1214","우균이네","서울","053-11"));
//		assertEquals(1,result); //기대값,실제값		
//	}
//    
//	@Test
//	public void ResDaoTest2_delete() throws Exception {
//		ResDao dao = new ResDao();
//	    assertNotNull(dao);
//	    int result = dao.delete(Integer.parseInt("6"));;
//	    assertEquals(1, result);		
//	}	
//	
//	//------------------------------------------------------------
//	
//	
//	@Test
//	public void UserDaoTest1() throws Exception {
//	    UserDao dao = new UserDao();
//	    // 객체연결 여부 확인 Test함수
//	    assertNotNull(dao);
//	    int result = dao.insert(new UserDto("6", "1234", "김승훈", "대구시", "010-88"));
//	    assertEquals(1, result);
//	}
//
//	
//	@Test
//	public void Userselect1() throws Exception {
//		UserDao dao = UserDao.getInstance();
//        assertNotNull(dao);
//        
//        List<UserDto> resultList = dao.select();
//        assertNotNull(resultList);
//        for (UserDto dto : resultList) {
//            System.out.println("회원아이디: " + dto.getId());
//            System.out.println("회원비밀번호: " + dto.getPw());
//            System.out.println("회원이름: " + dto.getName());
//            System.out.println("회원주소: " + dto.getAddr());
//            System.out.println("회원폰번호: " + dto.getPhone());
//           
//            System.out.println("---------------");
//           
//        }
//     }
//	
//	@Test
//	public void UserDao_update() throws Exception {
//		UserDao dao = new UserDao();
//		assertNotNull(dao);
//		int result=dao.update(new UserDto("3","1214","백승하","서울","110-22"));
//		assertEquals(1,result); //기대값,실제값		
//	}
//	
//	@Test
//	public void UserDaoTest2_delete() throws Exception {
//		UserDao dao = new UserDao();
//	    assertNotNull(dao);
//	    int result = dao.delete(Integer.parseInt("8"));;
//	    assertEquals(1, result);		
//	}	
//	
//	
//}
//
//
//
//
//    
//
//
//
