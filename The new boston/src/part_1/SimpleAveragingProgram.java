package part_1;

import java.util.Scanner;

public class SimpleAveragingProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int numbers;
		double average;
		int count = 0;
		System.out.println("How many numbers do you want to average- ");
		int numberOfAvarages = input.nextInt();
		while(count < numberOfAvarages){
			System.out.println("Give me a number- ");
			numbers = input.nextInt();
			total = total + numbers;
			count++;
		}
		average = total / numberOfAvarages;
		System.out.printf("The average is- %s", average);
		

	}

}
