package part_1;

import java.util.Random;

public class Tutorial_30 {

	public static void main(String[] args) {
		Random r = new Random();
		int n[]  = new int[7];
		
		for(int roll = 0; roll <= 101;roll ++){
			++n[1+r.nextInt(6)];//This takes an array number randomly and add one to it
		}
		
		System.out.println("Number     Frequency");
		
		for(int numbers = 1; numbers<=6;numbers++){
			System.out.println(numbers + "          " + n[numbers]);
		}
	}

}
