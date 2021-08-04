package com.bl.fds;

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
	public String toString() {
		return "Biryani [taste=" + taste + ", price=" + price + ", type=" + type + ", category=" + category + "]";
	}

}
