package part_1;

public class _16_ {
	private String thingName;//Private means it can only be accesed by this class
	public void setName(String name){
		thingName = name;
	}
	public String getName(){
		return thingName;//Returns thingName
	}
	public void saying(){
		System.out.printf("Your thing was %s", thingName);//Only printf can do the % thing
	
	}
}
