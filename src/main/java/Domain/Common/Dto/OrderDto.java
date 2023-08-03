package Domain.Common.Dto;

import java.util.Date;

public class OrderDto {
	
	private int order_id;
	private String user_id;
	private int id;
	private String name;
	private String addr;
	private int amount;
	private Date date;
	private int price;
	
	public OrderDto() {
		super();
	}

	public OrderDto(int order_id, String user_id, int id, String name, String addr, int amount, Date date, int price) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.amount = amount;
		this.date = date;
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderDto [order_id=" + order_id + ", user_id=" + user_id + ", id=" + id + ", name=" + name + ", addr="
				+ addr + ", amount=" + amount + ", date=" + date + ", price=" + price + "]";
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
