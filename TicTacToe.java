/* Name : Mihir Patel
 * Date : June 28, 2017
 * Desc : Implement a TicTacToe game between that is played with two players.
 * File : TicTacToe.java
 */

import java.util.*;
public class TicTacToe {
	
	private static final int ROWS = 3;
	private static final int COLS = 3;
	private static final int NUM_OF_PLAYERS = 2;
	private char [][] grid;
	private char [] player_marks;
	private String [] player_names;
	
	/* ---------------------- TicTacToe() -------------------------- */
	TicTacToe() {
		grid = new char[ROWS][COLS];
		player_marks = new char[NUM_OF_PLAYERS];
		player_names = new String[NUM_OF_PLAYERS];
		player_names[0] = "Player 1";
		player_names[1] = "Player 2";
	}
	
	/* ---------------------- setBoard() --------------------------- */
	public void setBoard() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				grid[i][j] = '-';
			}
		}
	}
	
	/* ---------------------- displayBoard() ------------------------ */
	public void displayBoard() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
	
	
	/* ----------------------- setPlayerMarks() --------------------- */
	public void setPlayerMarks() {
		int i = 0;
		while (i < NUM_OF_PLAYERS) {
			System.out.println(player_names[i] + ", enter your mark : ");
			Scanner in = new Scanner(System.in);
			String mark = in.next();
			player_marks[i] = mark.charAt(0);
			i++;
		}
	}
	
	/* ------------------------ getPlayerName() ----------------------- */
	public String getPlayerName(int idx) {
		if (idx == 0 || idx == 1) {
			return player_names[idx];
		}
		return null;
	}
	
	/* ---------------------------- isGameWon() ---------------------- */
	public boolean isGameWon() {
		// top across
		if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2] && grid[0][2] != '-') {
			return true;
		}
		
		// middle across
		if (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2] && grid[1][2] != '-') {
			return true;
		}
		
		// bottom across
		if (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2] && grid[2][2] != '-') {
			return true;
		}
		
		// left column
		if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0] && grid[2][0] != '-') {
			return true;
		}
		
		// middle column
		if (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1] && grid[2][1] != '-') {
			return true;
		}
		
		// right column
		if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2] && grid[2][2] != '-') {
			return true;
		}
		
		// left to right diagonal
		if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[2][2] != '-') {
			return true;
		}
		
		// right to left diagonal
		if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[2][0] != '-') {
			return true;
		}
		return false;
	}
	
	/* ------------------------ isGameOver() ------------------------ */
	public boolean isGameOver() {
		
		// first check if it's won
		if (this.isGameWon()) {
			return true;
		}
		
		// check for the presence of empty slots, ie '-'
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				if (grid[i][j] == '-') {
					return false;
				}
			}
		}
		
		// at this point, we can assume the game is over...
		return true;
	}
	
	/* --------------------------------- makeMove() ------------------------------ */
	public void makeMove(int player_idx) {
		int tile = -1;
		do {
			System.out.println(player_names[player_idx] + ", make your move: ");
			Scanner in  = new Scanner(System.in);
		    tile = in.nextInt();
		} while (!isValidMove(tile));
		
		int row_idx = (tile - 1) / ROWS;
		int col_idx = (tile - 1) % COLS;
		grid[row_idx][col_idx] = player_marks[player_idx];
		
	}
	
	/* ------------------------------- isValidMove() ----------------------------- */
	private boolean isValidMove(int n) {
		
		int row_idx = (n - 1) / ROWS;
		int col_idx = (n - 1) % COLS;
		if (row_idx >= 0 && row_idx <= 2 && col_idx >= 0 && col_idx <= 2){
			if (grid[row_idx][col_idx] == '-') {
				return true;
			}
		}
		System.out.println("Invalid move!");
		return false;
	}
	

}
