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
		System.out.println("DEBUG: setting point (" + x + "," + y + ")");
		theBoard[x][y] = charToSet;
	}

	public char getPoint(int x, int y) {
		return theBoard[x][y];
	}

	public void print() {
		String currentRow = new String();
		for (int i = 0; i < Constants.WIDTH; i++) {
			for (int j = 0; j < Constants.HEIGHT; j++) {
				//currentRow.concat(getPoint(i,j));
				currentRow = currentRow + getPoint(i,j);
				//System.out.println(getPoint(i,j)+".");
			}
			System.out.println(currentRow);
			currentRow = "";
		}
	}
}
