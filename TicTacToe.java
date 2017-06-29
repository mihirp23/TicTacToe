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
	
	/* ---------------------- TicTacToe() -------------------------- */
	TicTacToe() {
		grid = new char[ROWS][COLS];
		player_marks = new char[NUM_OF_PLAYERS];
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
		int i = 1;
		while (i <= NUM_OF_PLAYERS) {
			System.out.println("Player " + i + " enter your mark : ");
			Scanner in = new Scanner(System.in);
			String mark = in.next();
			player_marks[i-1] = mark.charAt(0);
			i++;
		}
	}
	
	

}
