public class Player {
	int xcoord = (Constants.HEIGHT/2); // need to convert
	int ycoord = (Constants.WIDTH/2); // to an array?
	int moveCount = 0;
	public void move(int xoffset, int yoffset) {
		if (((xcoord + xoffset) <= (Constants.WIDTH)) && ((ycoord + yoffset) <= (Constants.HEIGHT-1)) && ((xcoord + xoffset) >= 0) && ((ycoord + yoffset) >= 0)){
			Game.board.setPoint(xcoord,ycoord,Constants.ZERO);
			xcoord = xcoord + xoffset;
			ycoord = ycoord + yoffset;
			Game.board.setPoint(xcoord,ycoord,Constants.PLAYER);
			moveCount++;
			HeadsUp.set(4,Constants.MSG_MOVECOUNTER + moveCount);
			Game.board.print();
		}
	}
	public void redraw(){
		Game.board.setPoint(xcoord,ycoord,Constants.PLAYER);
	}
}
