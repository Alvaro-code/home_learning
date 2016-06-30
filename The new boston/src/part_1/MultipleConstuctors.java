package part_1;

public class MultipleConstuctors {

	public static void main(String[] args) {
		MultipleConstructor hour = new MultipleConstructor();//No arguments
		MultipleConstructor hour1 = new MultipleConstructor(34, 12);
		MultipleConstructor hour2 = new MultipleConstructor(12, 43, 21);//Three arguments

		System.out.println(hour.toMilitary());
		System.out.println(hour1.toMilitary());
		System.out.println(hour2.toMilitary());
	}

}
