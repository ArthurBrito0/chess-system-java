package boardGame;

public class Position {

	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColum() {
		return column;
	}
	public void setColum(int colum) {
		this.column = colum;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
