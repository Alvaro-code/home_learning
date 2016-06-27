package part_1;

public class Constructor{
	private String thingName;
	public Constructor(String name){// This is a constructor you give it the same name as the class its in 
		thingName = name;
	}
	public String getName(){
		return thingName;
	}
	public void saying(){
		System.out.printf("Your thing was %s", thingName);
	
	}
}
