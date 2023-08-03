package Domain.Common.Service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import Domain.Common.Dto.UserDto;

public interface UserService {

	//회원 가입하기
		boolean UserJoin(UserDto dto) throws Exception;
		
		//회원 조회하기(전체) - 사서
		List<UserDto> userSearch(String sid) throws Exception;

		//회원 조회하기(한명) - 사서
		UserDto userSearchOne(String role, String id) throws Exception;
		
		//회원 조회하기(한명) 
		UserDto userSearch(String id, String sid) throws Exception;
		
		//회원 수정하기 -- 본인확인
		boolean UserUpdate(UserDto dto, String sid) throws Exception;

		// 회원 삭제하기
		boolean UserDelete(String id, String sid) throws Exception;

		
		//로그인
		boolean login(HttpServletRequest req) throws Exception;
		
		//로그아웃
		void logout(String sid);
		
		//역활반환 함수
		String getRole(String sid);

	



}