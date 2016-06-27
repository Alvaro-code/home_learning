package part_1;

public class Tutorial_32 {

	public static void main(String[] args) {
		int a[] = {5, 6, 1, 4, 7};
		change(a);
		
		for(int y:a){
			System.out.println(a);
		}
		
	}
	public static void change(int x[]){//makes a function with the parameters of an array
		for(int counter=0;counter<x.length;counter++){
			x[counter]+=5;//It gets x and adds five to every value and sets it to x

		}
	}

}
