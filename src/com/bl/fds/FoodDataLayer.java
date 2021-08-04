package com.bl.fds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FoodDataLayer {
	List<FoodItem> foodList = new ArrayList<>();

	public void add(FoodItem foodItem) {
		foodList.add(foodItem);
	}

	public void print() {
		for (Object foodItem : foodList) {
			System.out.println(foodItem);
		}
	}

	public void delete(FoodItem foodItem) {
		foodList.remove(foodItem);
	}

	public FoodItem getFoodItem(String name) {
		for (int i = 0; i < foodList.size(); i++) {
			if (name.equals(foodList.get(i).name)) {
				return foodList.get(i);
			}
		}
		return null;
	}
}
