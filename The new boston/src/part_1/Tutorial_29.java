package part_1;

public class Tutorial_29 {

	public static void main(String[] args) {
		int[] b = {12, 22, 11, 19};
		int sum = 0;
		
		for(int c = 0; c < b.length; c++){
			sum += b[c];//+= adds sum + b and sets it to sum
		}
		System.out.println(sum);
	}

}
