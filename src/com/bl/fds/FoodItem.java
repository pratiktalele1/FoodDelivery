package com.bl.fds;

import java.util.Objects;

public class FoodItem {

	enum Taste {
		SWEET, SALTY, SPICY;
	}

	enum Type {
		VEG, NONVEG;
	}

	enum Category {
		STARTER, JUICE, MAINCOURSE, SWEETS;
	}

	protected Taste taste;
	protected int price;
	protected Type type;
	protected Category category;
	protected String name;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
//		return Objects.hash( name, price, taste, type);
		return Objects.hash( name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItem other = (FoodItem) obj;
//		return category == other.category && Objects.equals(name, other.name) && price == other.price
//				&& taste == other.taste && type == other.type;
		
		return Objects.equals(name, other.name) ;
	}

	public Taste getTaste() {
		return taste;
	}

	public void setTaste(Taste taste) {
		this.taste = taste;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FoodItem [taste=" + taste + ", price=" + price + ", type=" + type + ", category=" + category + ", name="
				+ name + "]";
	}

	

}
