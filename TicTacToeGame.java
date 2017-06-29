/* Name : Mihir Patel
 * Date : June 28, 2017
 * Desc : Run the TicTacToe game between that is played with two players.
 * File : TicTacToeGame.java
 */
public class TicTacToeGame {

	public static void main(String[] args) {
		
		// welcome message and instructions
		System.out.println("Welcome to the game of Tic Tac Toe!");
		System.out.println("Below, you will see a board with 9 tiles.");
		System.out.println("When choosing, please choose an empty tile between 1 and 9.");
		System.out.println();
		System.out.println();
		
		// initial setup for games
		TicTacToe game = new TicTacToe();
		game.setBoard();
		game.displayBoard();
		game.setPlayerMarks();
		
		int player = 0;
		// keep getting moves from users until game is over...
		do {
			System.out.println(player);
			game.makeMove(player);
			game.displayBoard();
			// alternate player turns
			player ^= 1;
		}while (!game.isGameOver());
		
		System.out.println();
		System.out.println();
		
		// display winner
		if (game.isGameWon()) {
			player ^= 1;
			System.out.println(game.getPlayerName(player) + " wins!");
		}
		else {
			System.out.println("Game ended in a tie...");
		}
		
	}

}
