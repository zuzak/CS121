public class Player {
	int xcoord = 0; // need to convert
	int ycoord = 0; // to an array?

	public void movePlayer(int xoffset, int yoffset) {
		System.out.println("Moving player...");
		Game.board.setPoint(xcoord,ycoord,Constants.ZERO);
		xcoord = xcoord + xoffset;
		ycoord = ycoord + yoffset;
		Game.board.setPoint(xcoord,ycoord,Constants.PLAYER);
		Game.board.print();	
	}
}
