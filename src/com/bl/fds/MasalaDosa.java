package com.bl.fds;

import com.bl.fds.FoodItem.Category;
import com.bl.fds.FoodItem.Taste;
import com.bl.fds.FoodItem.Type;

public class MasalaDosa extends FoodItem {

	public MasalaDosa() {
		this.taste = Taste.SPICY;
		this.category = Category.STARTER;
		this.type = Type.VEG;
		this.name="MasalaDosa";
	}

//	@Override
//	public String toString() {
//		return "MasalaDosa [taste=" + taste + ", price=" + price + ", type=" + type + ", category=" + category
//				+ ", name=" + name + "]";
//	}
	
	
	
}
