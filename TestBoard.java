public class TestBoard {
	public static Board board = new Board();
	public static void main(String args[]){
		//public Board board = new Board();
		//Constants constant = new Constants();
		board.fill(Constants.ZERO);//Constants.ZERO);
		HeadsUp.init();
		board.print();
	}
}
