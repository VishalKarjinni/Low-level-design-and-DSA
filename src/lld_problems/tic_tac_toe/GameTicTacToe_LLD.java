package lld_problems.tic_tac_toe;

public class GameTicTacToe_LLD {
    public static void main(String[] args) {
        Player player1 = new Player("Alice", PieceType.X);
        Player player2 = new Player("Bob",   PieceType.O);

        // Choose strategy — swap this for a custom strategy without touching Game
        WinStrategy strategy = new NInARowWinStrategy();

        // Build game (3×3 board)
        Game game = new Game(3, player1, player2, strategy);

        // Start controller
        GameController gameController = new GameController(game);
        gameController.start();
    }
}
