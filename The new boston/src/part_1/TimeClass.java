package part_1;

public class TimeClass {

	public static void main(String[] args) {
		TimeClas time = new TimeClas();
		System.out.println(time.toMilitary());
		System.out.println(time.toNormal());
		time.setTime(20, 21, 23);
	}

}
