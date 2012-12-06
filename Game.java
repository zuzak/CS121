import java.util.Scanner;
import java.util.ArrayList;
public class Game {
	public static Board board = new Board();
	public static int level = 1;
	public static ArrayList<Block> blocks = new ArrayList<Block>();
	public static void Begin(){
		/* INITIALISE */
		board.fill(Constants.ZERO);
		HeadsUp.init();
		board.print();
		Player player = new Player();
		player.redraw();
		Scanner input = new Scanner(System.in);
		boolean playing = true;
		while (playing) {
			System.out.print(Constants.MSG_SELECTOPTION);
			try {
				switch (input.next().charAt(0)) {
					case 'h':
						player.move(0,-1);
						break;             
					case 'j':         
						player.move(-1,0); 
						break;      
					case 'k':
						player.move(1,0);
						break;
					case 'l':
						player.move(0,1);
						break;
					case 'q':
						playing = false;
						HeadsUp.set(Constants.HEIGHT-1,Constants.MSG_QUITTING);
						break;
					default:
						HeadsUp.set(Constants.HEIGHT-1,Constants.MSG_INVALIDMOVE);
				}
			} catch(ArrayIndexOutOfBoundsException e) {
				HeadsUp.set(Constants.HEIGHT-1,Constants.MSG_ERRMOVE);
			}
			blocks.add(new Block());
			for(Block i : blocks) {
				i.age();
			}
			HeadsUp.set(Constants.HEIGHT-1,"");
			if (Player.getStrength() == 0){
				HeadsUp.set(8,Constants.MSG_GAMEOVER);
				playing = false;
			} else if (player.moveCount() == Constants.LEVELGOAL) {
				HeadsUp.set(8,Constants.MSG_LEVELCOMPLETE);
				level++;
				player.resetMoves();
				if (level == (Constants.LEVELLIFE.length)+1){
					HeadsUp.set(9,Constants.MSG_GAMEOVER);
					HeadsUp.set(10,Constants.MSG_WINNER);
					playing = false;
				}
			} else {
				HeadsUp.set(8,Constants.MSG_LEVEL+level);
			}
			

			board.print();
		}
	}
	public static int getLevel() {
		return level;
	}
}
