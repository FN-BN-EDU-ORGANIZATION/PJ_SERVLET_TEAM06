package Domain.Common.Dto;

import java.io.Serializable;
import java.util.List;

public class MenuDto{

	private int id;
	private String name;
	private String Photo_url;
	private String sharp_tag;
	private String description;
	private int price;
	
	public MenuDto() {
		super();
	}

	public MenuDto(int id, String name, String photo_url, String sharp_tag, String description, int price) {
		super();
		this.id = id;
		this.name = name;
		Photo_url = photo_url;
		this.sharp_tag = sharp_tag;
		this.description = description;
		this.price = price;
	}
	

	public MenuDto(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "MenuDto [id=" + id + ", name=" + name + ", Photo_url=" + Photo_url + ", sharp_tag=" + sharp_tag
				+ ", description=" + description + ", price=" + price + "]";
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

	public String getPhoto_url() {
		return Photo_url;
	}

	public void setPhoto_url(String photo_url) {
		Photo_url = photo_url;
	}

	public String getSharp_tag() {
		return sharp_tag;
	}

	public void setSharp_tag(String sharp_tag) {
		this.sharp_tag = sharp_tag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
}
