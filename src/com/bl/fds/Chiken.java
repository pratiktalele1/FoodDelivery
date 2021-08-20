package com.bl.fds;

import com.bl.fds.FoodItem.Category;
import com.bl.fds.FoodItem.Taste;
import com.bl.fds.FoodItem.Type;

public class Chiken extends FoodItem {
	public Chiken() {
		this.taste = Taste.SPICY;
		this.category = Category.MAINCOURSE;
		this.type = Type.NONVEG;
		this.name="Chiken";
		
		
	}

//	@Override
//	public String toString() {
//		return "Chiken [taste=" + taste + ", price=" + price + ", type=" + type + ", category=" + category + ", name="
//				+ name + "]";
//	}

		
	
}
