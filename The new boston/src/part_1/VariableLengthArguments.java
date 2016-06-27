package part_1;

public class VariableLengthArguments {

	public static void main(String[] args) {
		System.out.println(average(23,65,65,98));

	}
	
	public static int average(int...numbers){//This makes an array and it tells it that it doesn't know how many values it has
		int total = 0;
		for(int x:numbers)
			total+= x;
			return total/numbers.length;
		
	}

}
