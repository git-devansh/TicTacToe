
public class TicTacToe {

	public static void main(String[] args) {
		String[][] board = {
				{" ", " ", " | ", " ", " | ", " " },
				{"---", "+", "---", "+", "---" },
				{" ", " ", " | ", " ", " | ", " " },
				{"---", "+", "---", "+", "---" },
				{" ", " ", " | ", " ", " | ", " " },
		};
		
		
		displayBoard(board);

	}

	private static void displayBoard(String[][] board) {
		for(String[] row : board) {
			for(String col: row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
