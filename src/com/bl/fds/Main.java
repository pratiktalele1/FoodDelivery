package com.bl.fds;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
//		Biryani biryani = new Biryani();
//		biryani.setPrice(250);
//		
//		Biryani biryani1 = new Biryani();
//		biryani1.setPrice(250);
//
//		MasalaDosa dosa = new MasalaDosa();
//		dosa.setPrice(50);
//
//		VegRoll roll = new VegRoll();
//		roll.setPrice(75);
//
//		Chiken chiken = new Chiken();
//		chiken.setPrice(320);
//		
//		Chiken chiken1 = new Chiken();
//		chiken1.setPrice(320);

//		dataLayer.add(biryani);
//		dataLayer.add(biryani1);
//		dataLayer.add(chiken);
//		dataLayer.add(chiken1);
//		dataLayer.add(dosa);
//		dataLayer.add(roll);

//		  dataLayer.print();
//		  dataLayer.delete(biryani);		  
//		  System.out.println("printing menus after delete ::");
//		  dataLayer.print();

		Main main = new Main();
		main.showUserMenu();

	}

	public void showUserMenu() {
		
		FoodDataLayer dataLayer = FoodDataLayer.getInstance();
		//		int i = 1;
		int getUserInput=1;
		while (getUserInput != 4) {
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("1=>Adding menus \n " + "2=>Delete menus \n " + "3=>Print all menus \n " + "4=>Exit");
			Scanner scanInput = new Scanner(System.in);
			getUserInput = scanInput.nextInt();
			System.out.println("-----------------------------------------------------------------------------------");
			
			switch (getUserInput) {
			case 1: {

				dataLayer.add(dataLayer.addFoodItem());
//				dataLayer.print();

				break;
			}
			case 2: {

//				dataLayer.print();
				System.out.print("Enter food name you want to delete :: ");
				Scanner scanInput1 = new Scanner(System.in);

				String getUserInput2 = scanInput1.nextLine();

				FoodItem deleteFood = dataLayer.getFoodItem(getUserInput2);
				dataLayer.delete(deleteFood);

//				dataLayer.print();

				break;
			}
			case 3: {
				dataLayer.print();

				break;
			}
			case 4: {
				getUserInput = 4;
				break;
			}
			}

		}
	}

}
