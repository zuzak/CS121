interface Constants { // not sure what an interface is, but hey
	public final static char ZERO         = ' ';
	public final static char PLAYER       = '@';
	public final static char BLOCK        = '\u2588';
	public final static char SHADOW       = '\u2591';
	public final static char BORDERY      = '|';
	public final static char CORNER       = '+';
	public final static char BORDERX      = '―';
	public final static int  WIDTH        = 12;
	public final static int  HEIGHT       = 12;
	public final static int  PADDING      = 3;
	public final static char PADDINGCHAR  = ' ';
	public final static int  MAXLENGTH    = 74;
	public final static int  SHADOWTIME    = 4444;
	public final static int INITALSTRENGTH = 3;
	// i18n
	public final static int LEVELLIFE[] = {66, 88, 110};	
//	public final static int LEVELLIFE[1] = 5;
//	public final static int LEVELLIFE[2] = 10;
	public final static String MSG_SELECTOPTION = "Please select an option: ";
	public final static String MSG_QUITTING = "Quitting...";
	public final static String MSG_INVALIDMOVE = "Invalid move.";
	public final static String MSG_ERRMOVE = "Invalid move.";
	
	public final static String MSG_MOVECOUNTER = "Score: ";

	public final static String MSG_GAMENAME = "BlockAttack";
	public final static String MSG_GAMESUBTITLE = "Avoid the blocks!";
	public final static String MSG_BLOCKINWAY = "You can't do that.";
}
