public class HeadsUp {
	static String HUD[] = new String[Constants.HEIGHT];

	static public void init(){ 
		setHUD(0,"Hello!");
		setHUD(1,"Wheee!");
		HUD[3] = "aaaa";
	}
	static public String get(int index){
		return HUD[index];
	}

	static public void setHUD(int index,String string){
		HUD[index] = string;
	}
}
