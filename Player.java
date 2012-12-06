public class Player {
	int xcoord = (Constants.HEIGHT/2); // need to convert
	int ycoord = (Constants.WIDTH/2); // to an array?
	int moveCount = 0;
	static int lives = Constants.INITIALSTRENGTH;// = Constants.INITIALSTRENGTH;

	public void move(int xoffset, int yoffset) {
		if (((xcoord + xoffset) <= (Constants.WIDTH)) && ((ycoord + yoffset) <= (Constants.HEIGHT-1)) && ((xcoord + xoffset) >= 0) && ((ycoord + yoffset) >= 0)){
			int newx = xcoord + xoffset;
			int newy = ycoord + yoffset;
			if (Game.board.getPoint(newx,newy) == Constants.BLOCK) {
				Strength(-1);
			} else {
				Game.board.setPoint(xcoord,ycoord,Constants.ZERO);
				xcoord = newx;
				ycoord = newy;
				Game.board.setPoint(xcoord,ycoord,Constants.PLAYER);
				
				moveCount++;
				HeadsUp.set(4,Constants.MSG_MOVECOUNTER + moveCount);
				Game.board.print();
			}
		} else {
			HeadsUp.set(Constants.HEIGHT-1,Constants.MSG_BLOCKINWAY);
		}
	}
	public Player() {
		Game.board.setPoint(xcoord,ycoord,Constants.PLAYER);
		Game.board.print();
	}
	public int moveCount() {
		return moveCount;
	}
	public void resetMoves() {
		moveCount = 0;
	}
	public void redraw(){
		Game.board.setPoint(xcoord,ycoord,Constants.PLAYER);
	}
	public static void Strength(int modifier){
		lives = lives + modifier;
		HeadsUp.set(5,Constants.MSG_STRENGTH+lives);
	}
	public static int getStrength(){
		return lives;
	}
}
