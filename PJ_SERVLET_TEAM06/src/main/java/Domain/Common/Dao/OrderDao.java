package Domain.Common.Dao;

import java.util.List;

import Domain.Common.Dto.OrderDto;

public interface OrderDao {

	int insert(OrderDto dto) throws Exception;

	List<OrderDto> select() throws Exception;

	OrderDto select(int order_id) throws Exception;

	int update(OrderDto dto) throws Exception;

	int delete(int order_id) throws Exception;

}