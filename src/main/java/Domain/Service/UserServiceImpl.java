package Domain.Service;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import Domain.Dao.UserDao;
import Domain.Dao.UserDaoImpl;
import Domain.Dto.UserDto;
import Domain.Service.Auth.Session;

public class UserServiceImpl implements UserService {
	
	//세션정보저장
	public Map<String,Session> sessionMap;


	private UserDao dao;

	
	//싱글톤
    private static UserService instance;
    public static UserService getInstance() {
        if (instance == null)
            instance = new UserServiceImpl();
        return instance;
    }

    private UserServiceImpl() {
        dao = UserDaoImpl.getInstance();
		sessionMap=new HashMap();
    }

    // 회원 가입하기
    @Override
	public boolean UserJoin(UserDto dto) throws Exception {
        int result = dao.insert(dto);
        if(result>0) 
        	return true;
   
        return false;

    }
    
    @Override
	public List<UserDto> userSearch(String sid) throws Exception {
	
    	String role = this.getRole(sid);
    	if(role.equals("ROLE_RES"))
    		return dao.selectAll();
    	return null;
	}
    
    //회원 조회하기(한명)- 사서
    @Override
	public UserDto userSearchOne(String sid, String id) throws Exception {
		String role = sid;
		if(role.equals("ROLE_RES")) {
			return dao.select(id);
		}else if(role.equals("ROLE_USER")) {
			return dao.select(id);
		}else {
			return null;
		}
			
	}
    

    
    //회원 조회하기(한명)
    @Override
	public UserDto userSearch(String id, String sid) throws Exception {
    	String role = sid;
    	if(role.equals("ROLE_RES")) {
    		return dao.select(id);
    	}
    	return null;
    	
    }
    
    //회원 수정하기 -- 본인 확인
    @Override
	public boolean UserUpdate(UserDto dto, String sid) throws Exception {
  
    	Session session = sessionMap.get(sid);
        if (session != null && session.getId().equals(dto.getId())) {
            int result = dao.update(dto);
            if(result > 0)
            	return true;
            
        }
        return false;
    }

    //회원 삭제하기
    @Override
	public boolean UserDelete(String id, String sid) throws Exception {
        Session session = sessionMap.get(sid);
        if (session != null && session.getId().equals(id)) 
        {
            int result = dao.delete(id);
            if( result > 0)
            	return true;
        }
        return false;
    }
    
    
    //로그인
    @Override
	public boolean login(HttpServletRequest req) throws Exception{
		String id = (String) req.getParameter("id");
		String pw = (String) req.getParameter("pw");
		
		
		//1 ID/PW 체크 ->Dao 전달받은 id와 일치하는 정보를 가져와서 Pw일치 확인
    	UserDto dbDto = dao.select(id);
		if(dbDto==null) {
			System.out.println("[ERROR] Login Fail... 아이디가 일치하지 않습니다");
			return false;
		}
		if(!pw.equals(dbDto.getPw())) {
			System.out.println("[ERROR] Login Fail... 패스워드가 일치하지 않습니다");
			return false;
		}
		//2 사용자에대한 정보(Session)을 MemberService에 저장
		HttpSession session = req.getSession();
		session.setAttribute("ID: ",id);
		session.setAttribute("ROLE: ",dbDto.getRole());
		//session.setAttribute("User: ",UserDto.getRole());
		System.out.println("Session : "+ session);
		
		return true;
		
	}

 

    //로그아웃
	@Override
	public void logout( String sid) {
		sessionMap.remove(sid);
	}

	//역할반환함수
	@Override
	public String getRole(String sid) {
		Session session = sessionMap.get(sid);
		System.out.println("getRole's Session : " + session);
		if(session != null)
			return session.getRole();
		return null;
	}  
    
	
	
}


