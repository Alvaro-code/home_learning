package part_1;

public class TimeClas {
	private int hour;//Private means that only the methods on the same class can use it
	private int minute;//Public means that any class can use it
	private int second;
	
	public void setTime(int hour, int m, int s){
		hour = ((this.hour>=0 && this.hour<24 ) ?this.hour : 0);//If you dont put this its going to think its the loca variable not the methods ones
		minute = ((m>=0 && m<60 ) ? m : 0);
		second = ((s>=0 && s<60 ) ? s : 0);
	}
	
	public String toMilitary(){//%d is for ints, %02d is for ints to two decimal places
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toNormal(){//Returns normal time
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM"));
	}
}
