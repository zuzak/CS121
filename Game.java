import java.util.Scanner;
public class Game {
	public static Board board = new Board();
	public static void main(String args[]){
		//public Board board = new Board();
		//Constants constant = new Constants();
		board.fill(Constants.ZERO);//Constants.ZERO);
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
			Block foo = new Block();
			foo.Block();
			board.blank();
			board.print();
			HeadsUp.set(Constants.HEIGHT-1,"");
		}
	}
}
