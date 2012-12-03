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
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				switch (input.next().charAt(0)) {
					case 'h':
						player.move(0,-1);  //  |y
						break;             //   |  
					case 'j':             //    +--- x
						player.move(-1,0); // -1 0 up
						break;        // 1 0 down
					case 'k':
						player.move(1,0);
						break;
					case 'l':
						player.move(0,1);
						break;
					default:
						HeadsUp.set(Constants.HEIGHT-1,"Invalid move!");
				}
			} catch(ArrayIndexOutOfBoundsException e) {
				HeadsUp.set(Constants.HEIGHT-1,"Disallowed move!");
			}
			board.blank();
			board.print();
			HeadsUp.set(Constants.HEIGHT-1,"");
		}
	}
}
