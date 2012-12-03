public class Board {
	char theBoard[][] = new char [Constants.WIDTH+1][Constants.HEIGHT+1];

	public void fill(char charToFill) {
		for (int x = 0; x < (Constants.WIDTH); x++) {
			for (int y = 0; y < (Constants.HEIGHT); y++) {
				setPoint(x,y,charToFill);
			}
		}
	}

	public void setPoint(int x, int y, char charToSet) {
		theBoard[x][y] = charToSet;
	}

	public char getPoint(int x, int y) {
		return theBoard[x][y];
	}

	public void print() {
		String currentRow = new String();
		printPadding(Constants.PADDING);
		System.out.print(Constants.CORNER);
		for (int i = 0; i < Constants.WIDTH; i++) {
			System.out.print(Constants.BORDERX);	
		}
		System.out.print(Constants.CORNER+"\n");
		for (int i = 0; i < Constants.WIDTH; i++) {
			printPadding(Constants.PADDING);
			currentRow = "" + Constants.BORDERY;
			for (int j = 0; j < Constants.HEIGHT; j++) {
				currentRow = currentRow + getPoint(i,j);
			}
			currentRow = currentRow + Constants.BORDERY;
			System.out.println(currentRow);
		}
		printPadding(Constants.PADDING);
		System.out.print(Constants.CORNER);
		for (int i = 0; i < Constants.WIDTH; i++) {
			System.out.print(Constants.BORDERX);
		}
		System.out.print(Constants.CORNER+"\n");
	}

	public void printPadding(int padding) {
		for (int i = 0; i < padding; i++) {
			System.out.print(Constants.PADDINGCHAR);
		}
	}
}
