package Domain.Common.Dto;

import java.util.Date;

public class OrderDto {
	
	private int order_id;
	private String user_id;
	private int menu_id;
	private String menu_name;
	private String addr;
	private int amount;
	private Date date;
	private int price;
	
	public OrderDto() {
		super();
	}

	public OrderDto(int order_id, String user_id, int menu_id, String menu_name, String addr, int amount, Date date,
			int price) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.menu_id = menu_id;
		this.menu_name = menu_name;
		this.addr = addr;
		this.amount = amount;
		this.date = date;
		this.price = price;
	}
	

	public OrderDto(String user_id, int menu_id, int amount) {
		super();
		this.user_id = user_id;
		this.menu_id = menu_id;
		this.amount = amount;
	}
	
	

	public OrderDto(int order_id, String user_id, int amount, int price) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.amount = amount;
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderDto [order_id=" + order_id + ", user_id=" + user_id + ", menu_id=" + menu_id + ", menu_name="
				+ menu_name + ", addr=" + addr + ", amount=" + amount + ", date=" + date + ", price=" + price + "]";
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
