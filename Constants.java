interface Constants { // not sure what an interface is, but hey
	public final static char ZERO         = ' '; // a blank space
	public final static char PLAYER       = '@'; // the player character
	public final static char BLOCK        = 'B'; // a block
	public final static char SHADOW       = 'S'; // a block's shadow
	public final static char BORDERY      = '|'; // vertical border of board
	public final static char CORNER       = '+'; // corners of board
	public final static char BORDERX      = '-'; // horizontal borders of board
	public final static int  WIDTH        = 12; // width of board
	public final static int  HEIGHT       = 12; // height of board
	public final static int  PADDING      = 3; // padding each side of board
	public final static char PADDINGCHAR  = ' '; // char used to pad
	public final static int  SHADOWTIME    = -2; // shadows turn to blocks at 0
	public final static int  INITIALSTRENGTH = 3; // lives the player starts with
	public final static int  LEVELGOAL    = 200; // points player must reach to continue
	public final static int  LEVELMAX = 3; // number of levels at which the game ends
	public final static int LEVELLIFE[] = {66, 88, 110};
	public final static String MSG_LEVELCOMPLETE = "*** LEVEL COMPLETE ***";
	public final static String MSG_WINNER = "YOU HAVE WON";
	public final static String MSG_LEVEL = "Level: ";
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
	public final static String MSG_STRENGTH = "Strength: ";
	public final static String MSG_GAMEOVER = "*** GAME OVER ***";
}
