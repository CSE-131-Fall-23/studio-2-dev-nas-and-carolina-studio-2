package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Total simulations?");
		int totalSimulations = in.nextInt();
		System.out.println("What amount would you like to start with?($)");
		int startAmount = in.nextInt();
		System.out.println("What is your chance of winning?");
		double winChance = in.nextDouble();
		System.out.println("At what amount would you like to leave with?($)");
		int winLimit = in.nextInt();
		for (int count = 0; count <= totalSimulations; count ++) {
			int counter = 0;
			while (startAmount <= winLimit && startAmount != 0) {
				counter ++;
				System.out.println(counter);
				if (Math.random() <= winChance) {
					startAmount++;
					//System.out.println("Success :)");
				} else {
					//System.out.println("Ruin :(");
					startAmount--;
				}
			}
			if (startAmount == 0) {
				//System.out.println("Terrible day");
				System.out.println("Your day is ruined. You played this many times" + counter);
			} else {
				//System.out.println("GOOD WIN!!");
				System.out.println("Your day is a success. You played this many tiems" +counter);
			}
		}
	}

}
