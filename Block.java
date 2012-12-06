import java.util.Random;
public class Block {
	int xcoord = -1;
	int ycoord = -1;
	int lifetime;  
	Random rand = new Random();
	void Block() {
		lifetime = -3;
//		while (Game.board.getPoint(xcoord, ycoord) != Constants.ZERO) {
			xcoord = rand.nextInt(Constants.WIDTH);
			ycoord = rand.nextInt(Constants.HEIGHT);
//		}
		Game.board.setPoint(xcoord,ycoord,Constants.SHADOW);
		age();
	}
	public void age() {
		if (xcoord == -1) { // double check, just in case
			Block();
		}
		lifetime++;
		if (lifetime == 0) {
			if (Game.board.getPoint(xcoord,ycoord) == Constants.PLAYER){
				Player.Strength(-1);
			} else {
				Game.board.setPoint(xcoord,ycoord,Constants.BLOCK);
			}
		} else if (lifetime == Constants.LEVELLIFE[Game.getLevel()]) {
			Game.board.setPoint(xcoord, ycoord, Constants.ZERO);
		} else {
//			Game.board.setPoint(xcoord, ycoord, Constants.SHADOW);
		}
	}
}
