import java.util.Random;
public class Block {
	int xcoord = -1;
	int ycoord = -1;
	int lifetime;  
	Random rand = new Random();
	void Block() {
		lifetime = -3;
		xcoord = rand.nextInt(Constants.WIDTH);
		ycoord = rand.nextInt(Constants.HEIGHT);
		Game.board.setPoint(xcoord,ycoord,Constants.SHADOW);
		age();
	}
	public void age() {
		if (xcoord == -1) { // double check, just in case [if not on board...]
			Block();
		}
		lifetime++; // block gets older
		if (lifetime == 0) { // gestation period over
			if (Game.board.getPoint(xcoord,ycoord) == Constants.PLAYER){
				Player.Strength(-1); // if player on top of shadow
			} else {
				Game.board.setPoint(xcoord,ycoord,Constants.BLOCK);
			}
		} else if (lifetime == Constants.LEVELLIFE[Game.getLevel()]) { // die of old age
			Game.board.setPoint(xcoord, ycoord, Constants.ZERO);
		}
	}
}
