package part_1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random dice = new Random();//Random function
		int number;
		System.out.println("To what number do you want to guess.");
		int toNumber = s.nextInt();
		

			System.out.printf("Your number is %s", 1+dice.nextInt(toNumber));
		
		
	}

}
