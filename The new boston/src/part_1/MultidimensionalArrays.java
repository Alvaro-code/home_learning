package part_1;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		int array[][]={{122, 2, 35, 24},{123, 321, 32, 12}};//The first braquet is to show that its an array the second row is to show the colum, to separate colums use:{{values in row 0},{row 1}}
		display(array);
	}
	public static void display(int x [][]){
		System.out.println("row\tcolum\tvalue");
		for(int row = 0; row < x.length;row++){
			for(int colum = 0; colum < x[row].length;colum++){
				System.out.print(row == 0 ? "1\t" : "2\t");
				System.out.println();
				System.out.println(x[row][colum]);
			}
		}
	}
}
