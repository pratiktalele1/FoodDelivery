package com.bl.fds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.bl.fds.FoodItem.Category;
import com.bl.fds.FoodItem.Taste;
import com.bl.fds.FoodItem.Type;

public class FoodDataLayer {
//	List<FoodItem> foodList = new ArrayList<>();
	Set<FoodItem> foodList = new HashSet<FoodItem>();
	Scanner scanInput = new Scanner(System.in);
	private static FoodDataLayer dataLayer;
	private FoodDataLayer() {
		
	}
	
	static public FoodDataLayer  getInstance() {
		if(dataLayer==null) {
			dataLayer=new FoodDataLayer();
		}
		return dataLayer;
	}

	public void add(FoodItem foodItem) {
		foodList.add(foodItem);
	}

	public void print() {
		for (FoodItem foodItem : foodList) {
			System.out.println(foodItem);
//			FoodItem foodItem2=(FoodItem) foodItem;
//			System.out.println(foodItem2.getName());
		}
		
	}

	public void delete(FoodItem foodItem) {
		foodList.remove(foodItem);
	}

	public FoodItem getFoodItem(String name) {
//		if(foodList.size()>0) {
//			return (FoodItem) foodList.stream().filter(data -> data.equals(name)).collect(Collectors.toList()).get(0);
//		}else {
//			return null;
//		}


		for (FoodItem foodItem : foodList) {
			if(name.equals(foodItem.name)) {
				return foodItem;
			}
		}
		
		return null;
//		for (int i = 0; i < foodList.size(); i++) {
//			if (name.equals(foodList.contains(name))) {
//				return foodList.;
//			}
//		}

	}

	public FoodItem addFoodItem() {
		FoodItem foodItem = new FoodItem();

		System.out.print("Enter food name- ");
		String name = scanInput.next();
		foodItem.setName(name);

		System.out.print("Enter food price - ");
		int price = scanInput.nextInt();
		foodItem.setPrice(price);

		System.out.println("taste 1->SWEET 2->SALTY 3->SPICY");
		int taste = scanInput.nextInt();

		if (taste == 1) {
			foodItem.setTaste(Taste.SWEET);

		} else if (taste == 2) {
			foodItem.setTaste(Taste.SALTY);
		} else if (taste == 3) {
			foodItem.setTaste(Taste.SPICY);
		}

		System.out.println("type 1->VEG 2->NONVEG");
		int type = scanInput.nextInt();

		if (type == 1) {
			foodItem.setType(Type.VEG);

		} else if (type == 2) {
			foodItem.setType(Type.NONVEG);
		}

		System.out.println("category 1->STARTER 2->JUICE 3->MAINCOURSE 4->SWEETS;");
		int category = scanInput.nextInt();

		if (category == 1) {
			foodItem.setCategory(Category.STARTER);

		} else if (taste == 2) {
			foodItem.setCategory(Category.JUICE);
		} else if (taste == 3) {
			foodItem.setCategory(Category.MAINCOURSE);
		} else if (taste == 4) {
			foodItem.setCategory(Category.SWEETS);
		}
		
		return foodItem;

	}
}
