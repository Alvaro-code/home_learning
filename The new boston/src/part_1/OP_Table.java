package part_1;

import java.util.Scanner;

public class OP_Table {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("How many programming languages do you want to list- ");
		int l = n.nextInt();
		String h[] = new String[l];
		for(int a = 0; a < l; a++ ){
			System.out.printf("Tell me the number %s programming language- ", a+1);
			h[a] = n.nextLine();
			
		}
	}

}