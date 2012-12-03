public class Player {
	int xcoord = 0; // need to convert
	int ycoord = 0; // to an array?

	public void move(int xoffset, int yoffset) {
	if (((xcoord + xoffset) <= (Constants.WIDTH)) && ((ycoord + yoffset) < (Constants.HEIGHT-1)) && ((xcoord + xoffset) >= 0) && ((ycoord + yoffset) >= 0)){
			Game.board.setPoint(xcoord,ycoord,Constants.ZERO);
			xcoord = xcoord + xoffset;
			ycoord = ycoord + yoffset;
			Game.board.setPoint(xcoord,ycoord,Constants.PLAYER);
			Game.board.print();
		}
	}
}
