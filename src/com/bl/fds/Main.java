package com.bl.fds;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Biryani biryani = new Biryani();
		biryani.setPrice(250);

		MasalaDosa dosa = new MasalaDosa();
		dosa.setPrice(50);

		VegRoll roll = new VegRoll();
		roll.setPrice(75);

		Chiken chiken = new Chiken();
		chiken.setPrice(320);

		FoodDataLayer dataLayer = new FoodDataLayer();
		dataLayer.add(biryani);
		dataLayer.add(chiken);
		dataLayer.add(dosa);
		dataLayer.add(roll);

		dataLayer.print();

//		  dataLayer.delete(biryani);
//		  
//		  System.out.println("printing menus after delete ::");
//		  
//		  dataLayer.print();

		Main main = new Main();
		main.showUserMenu();

	}

	public void showUserMenu() {
		FoodDataLayer dataLayer = new FoodDataLayer();

		System.out.println("1=>Adding menus \n " + "2=>Delete menus \n " + "3=>Print all menus \n " + "4=>Exit");
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		
		
		
		switch (getUserInput) {
		case 1: {

			break;
		}
		case 2: {
			
			Biryani biryani = new Biryani();
			biryani.setPrice(250);
			dataLayer.add(biryani);
			
			MasalaDosa dosa = new MasalaDosa();
			dosa.setPrice(50);
			dataLayer.add(dosa);
			dataLayer.print();
			
			System.out.print("Enter food name you want to delete :: ");
			Scanner scanInput1 = new Scanner(System.in);
			String getUserInput2 = scanInput1.nextLine();
			FoodItem deleteFood = dataLayer.getFoodItem(getUserInput2);
			dataLayer.delete(deleteFood);
			dataLayer.print();
			break;
		}
		case 3: {
			break;
		}
		case 4: {

			break;
		}
		}

	}

}
