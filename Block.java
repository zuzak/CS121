import java.util.Random;
public class Block {
	int xcoord;
	int ycoord;
	int lifetime = (0 - Constants.SHADOWTIME);
	Random rand = new Random();
	void Block() {
		xcoord = rand.nextInt(Constants.WIDTH);
		ycoord = rand.nextInt(Constants.HEIGHT);
		lifetime++;
		Game.board.setPoint(xcoord,ycoord,Constants.SHADOW);
		if (lifetime == 0) {
			Game.board.setPoint(xcoord,ycoord,Constants.BLOCK);
		}
	}
}
