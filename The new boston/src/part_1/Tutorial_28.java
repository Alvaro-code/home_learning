package part_1;

public class Tutorial_28 {

	public static void main(String[] args) {
		System.out.println("Index\tValue");//Title of the table, \t is a tab(5 spaces)
		int b[] = {1,2,3,3,4};
		
		for(int c = 0; c <= b.length; c++){//.length showed the length of the array
			System.out.println(c + "\t" + b[c]);
		}

	}

}
