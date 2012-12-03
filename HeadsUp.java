public class HeadsUp {
	static String HUD[] = new String[Constants.HEIGHT];

	static public void init(){ 
		set(0,"Hello!");
		set(1,"Wheee!");
		HUD[3] = "aaaa";
	}
	static public String get(int index){
		return HUD[index];
	}

	static public void set(int index,String string){
		HUD[index] = string;
	}
}
