package part_1;

import java.util.Scanner;

public class Tutorial_12 {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		int age = v.nextInt();
		
		switch(age){//Inspects age
		case 1://If age equals 1 it does this-
			System.out.println("You can crawl.");
			break;//If its true it stops the switch
			
		case 2:
			System.out.println("You can talk.");
			break;
			
		case 3:
			System.out.println("You can stop driking milk.");
			break;
			
		case 4:
			System.out.println("You like to play.");
			break;
			
			default ://If none of these are true it does this
				System.out.println("Youre big.");
				break;
		}
	}

}
