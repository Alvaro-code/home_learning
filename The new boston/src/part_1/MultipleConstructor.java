package part_1;

public class MultipleConstructor {
	private int hour;
	private int minute;
	private int second;
	
	public MultipleConstructor(){//This is a constructor with no arguments
		this(0,0,0);
	}
	
	public MultipleConstructor(int h){
		this(h, 0,0);
	}
	public MultipleConstructor(int h, int m){
		this(h, m, 0);
	}
	
	public MultipleConstructor(int h, int m, int s){
		setTime(h, m, s);//If you give the method 3 parameters it sets it to this one
	}
	
	public void setTime(int h, int m, int s){
		setHour(h);//This is going to find the method SetHour and make h pass through it
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h){
		hour = ((h>=0&&h<24)? h : 0);
	}
	
	public void setMinute(int m){
		minute = ((m>=0&&m<60) ? m:0);
	}
	
	public void setSecond(int s){
		second = ((s>=0&&s<60) ? s:0);
	}
	
	private int getHour(){
		return hour;
	}
	
	private int getMinute(){
		return minute;
	}
	
	private int getSecond(){
		return second;
	}
	
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());//String.format is just used to return a string
	}

}
