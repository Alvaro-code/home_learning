package part_1;

public class CompoundInterestProgram {

	public static void main(String[] args) {
		double p = 10000;
		double rate = .01;
		int amount;
		
		for(int day = 1;day <= 365;day++){
			amount = (int) (p*Math.pow((1+rate), day));
			System.out.println("On day " + day +" you have " + amount + " subscribers.");
		}

	}

}