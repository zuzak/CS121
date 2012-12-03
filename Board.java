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
		System.out.println("Point ("+x+","+y+") set to '"+charToSet+"'");
	}

	public char getPoint(int x, int y) {
		return theBoard[x][y];
	}

	public void blank() {
		String newlines = new String();
		for (int i = 0; i < (Constants.HEIGHT + 5); i++){
			newlines = newlines + "\n";
		}
		System.out.print(newlines);
	}
	public void print() {
		blank();
		String currentRow = new String();
		System.out.print(Padding(Constants.PADDING)+Constants.CORNER);
		for (int i = 0; i < Constants.WIDTH; i++) {
			System.out.print(Constants.BORDERX);	
		}
		System.out.print(Constants.CORNER+"\n");
		for (int i = 0; i < Constants.WIDTH; i++) {
			currentRow = Padding(Constants.PADDING) + Constants.BORDERY;
			for (int j = 0; j < Constants.HEIGHT; j++) {
				currentRow = currentRow + getPoint(i,j);
			}
			currentRow = currentRow + Constants.BORDERY+Padding(Constants.PADDING)+HeadsUp.get(i);
			System.out.println(currentRow);
		}
		System.out.print(Padding(Constants.PADDING)+Constants.CORNER);
		for (int i = 0; i < Constants.WIDTH; i++) {
			System.out.print(Constants.BORDERX);
		}
		System.out.print(Constants.CORNER+"\n");
	}

	public String Padding(int padding) {
		String padstr = new String();
		for (int i = 0; i < padding; i++) {
			padstr = padstr + Constants.PADDINGCHAR;
		}
		return padstr;
	}
}
