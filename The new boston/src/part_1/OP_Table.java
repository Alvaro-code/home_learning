package part_1;

import java.util.Scanner;

public class OP_Table {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("How many programming languages do you want ot list- ");
		int l = n.nextInt();
		String[] pl = new String[l];
		for(int i = 0; i+1 < l; i++){
			System.out.printf("Tell me the number %s programing language- \n", i);
			String programming = programming.toString();
			
		}
		System.out.println("Tell me the first programing language.");
		System.out.println("Number\tProgramming language");
	    for(int c = 1; c == l; c++){
	    	System.out.println(c + "\t" + pl[c]);
	    }
	}

}