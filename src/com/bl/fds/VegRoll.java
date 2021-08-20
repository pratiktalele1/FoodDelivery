package com.bl.fds;

import com.bl.fds.FoodItem.Category;
import com.bl.fds.FoodItem.Taste;
import com.bl.fds.FoodItem.Type;

public class VegRoll extends FoodItem {

	public VegRoll() {
		this.taste = Taste.SALTY;
		this.category = Category.STARTER;
		this.type = Type.VEG;
		this.name="VegRoll";
	}

//	@Override
//	public String toString() {
//		return "VegRoll [taste=" + taste + ", price=" + price + ", type=" + type + ", category=" + category + ", name="
//				+ name + "]";
//	}
	
	

}
