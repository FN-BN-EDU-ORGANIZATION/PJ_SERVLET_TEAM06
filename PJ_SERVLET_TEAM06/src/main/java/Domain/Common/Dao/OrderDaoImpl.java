package Domain.Common.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Domain.Common.Dto.OrderDto;

public class OrderDaoImpl extends ConnectionPool implements OrderDao {

	
	private static OrderDao instance;
	public static OrderDao getInstance() {
		if (instance == null)
			instance = new OrderDaoImpl();
		return instance;
	}
	
	public OrderDaoImpl() {
		super();
	}
	
	// 주문 전체 조회
	@Override
	public List<OrderDto> select() throws Exception {
		List<OrderDto> list = new ArrayList();
		OrderDto dto = null;

		try {
		pstmt = conn.prepareStatement("select * from tbl_order");
		rs = pstmt.executeQuery();
		if (rs != null) {
			while (rs.next()) {
				dto = new OrderDto();
				dto.setOrder_id(rs.getInt("Order_id"));
				dto.setMenu_id(rs.getInt("Menu_id"));
				dto.setUser_id(rs.getString("user_id"));
				dto.setPrice(rs.getInt("price"));
				dto.setDate(rs.getDate("Date"));
				dto.setMenu_name(rs.getString("menu_name"));
				dto.setAmount(rs.getInt("amount"));
				dto.setAddr(rs.getString("addr"));
				list.add(dto);
			}
		}
		rs.close();
		pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// 주문 단건 조회
	@Override
	public OrderDto select(int order_id) throws Exception {
		OrderDto dto = null;
		
		try {
			pstmt = conn.prepareStatement("select * from tbl_order where order_id = ?");
			pstmt.setInt(1, order_id);
			if (rs != null) {
				while (rs.next()) {
					dto = new OrderDto();
					dto.setOrder_id(rs.getInt("Order_id"));
					dto.setMenu_id(rs.getInt("Menu_id"));
					dto.setUser_id(rs.getString("user_id"));
					dto.setPrice(rs.getInt("price"));
					dto.setDate(rs.getDate("Date"));
					dto.setMenu_name(rs.getString("menu_name"));
					dto.setAmount(rs.getInt("amount"));
					dto.setAddr(rs.getString("addr"));
					
				}
			}
			rs.close();
			pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return dto;
		}
	
	// 주문하기
	@Override
	public int insert(OrderDto dto) {

		try {
		pstmt = conn.prepareStatement("insert into tbl_order values(null,?,?,?,curdate(),?,?,?");
		dto.setOrder_id(rs.getInt("Order_id"));
		dto.setMenu_id(rs.getInt("Menu_id"));
		dto.setUser_id(rs.getString("user_id"));
		dto.setPrice(rs.getInt("price"));
		dto.setDate(rs.getDate("Date"));
		dto.setMenu_name(rs.getString("menu_name"));
		dto.setAmount(rs.getInt("amount"));
		dto.setAddr(rs.getString("addr"));
		
		int result = pstmt.executeUpdate();
		pstmt.close();
		return result;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;

	}




//주문 수정 
	@Override
	public int update(OrderDto dto) {
		try {
		pstmt = conn.prepareStatement("update tbl_order set user_id=?, amount =? , price=? where order_id=?");
		pstmt.setString(1, dto.getUser_id());
		pstmt.setInt(2, dto.getAmount());
		pstmt.setInt(3, dto.getPrice());
		pstmt.setInt(4, dto.getOrder_id());
		int result = pstmt.executeUpdate();
		pstmt.close();
		return result;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	//주문삭제
	@Override
	public int delete(int order_id)  {
		try {
		pstmt = conn.prepareStatement("delete from tbl_order where order_id=?");
		pstmt.setInt(1, order_id);
		int result = pstmt.executeUpdate();
		pstmt.close();
		return result;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
}
