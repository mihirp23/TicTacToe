/* Name : Mihir Patel
 * Date : June 28, 2017
 * Desc : Run the TicTacToe game between that is played with two players.
 * File : TicTacToeGame.java
 */
public class TicTacToeGame {

	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.setBoard();
		game.displayBoard();
		game.setPlayerMarks();
		int player = 0;
		do {
			game.makeMove(player);
			game.displayBoard();
			player ^= 1;
		    
			
		}while (!game.isGameOver());
		

	}

}
