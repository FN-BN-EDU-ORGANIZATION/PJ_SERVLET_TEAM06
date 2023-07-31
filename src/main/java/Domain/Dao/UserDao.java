package Domain.Dao;

import java.util.List;

import Domain.Dto.UserDto;

public interface UserDao {

	int insert(UserDto dto) throws Exception;

	List<UserDto> selectAll() throws Exception;

	UserDto select(String id) throws Exception;

	int update(UserDto dto) throws Exception;

	int delete(String id) throws Exception;

}
	
