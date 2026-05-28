package lld_problems.tic_tac_toe;

import java.util.Scanner;

public class GameController {
    private final Game game;
    private final Scanner scanner;

    public GameController(Game game) {
        this.game    = game;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=== TIC TAC TOE ===\n");
        game.printStatus();

        while (game.getGameStatus() == GameStatus.IN_PROGRESS) {
            Player current = game.getCurrentPlayer();
            System.out.print(current.getName() + " — enter row col: ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            try {
                GameStatus status = game.makeMove(row, col);
                game.getBoard().display();

                switch (status) {
                    case PLAYER1_WIN -> System.out.println("\n🎉 " + current.getName() + " wins!");
                    case PLAYER2_WIN -> System.out.println("\n🎉 " + current.getName() + " wins!");
                    case DRAW        -> System.out.println("\nIt's a draw!");
                    default          -> System.out.println("Turn: " + game.getCurrentPlayer());
                }
            } catch (IllegalArgumentException e) {
                System.out.println("⚠ " + e.getMessage() + " Try again.");
            }
        }
        scanner.close();
    }
}
