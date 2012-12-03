public class TestBoard {
	public static void main(String args[]){
		Board board = new Board();
		//Constants constant = new Constants();
		board.fill(Constants.ZERO);//Constants.ZERO);

		board.setPoint(5,3,' ');

		board.print();
	}
}
