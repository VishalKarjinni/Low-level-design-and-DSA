package lld_problems.tic_tac_toe;

import java.util.Arrays;
import java.util.List;

public class Game {
    private final Board board;
    private final List<Player> playerList;
    private final WinStrategy strategy;
    private int currentPlayerIndex;
    private GameStatus gameStatus;


    public Game(int boardSize, Player player1, Player player2, WinStrategy strategy) {
        this.board = new Board(boardSize);
        this.playerList = Arrays.asList(player1, player2);
        this.strategy = strategy;
        this.currentPlayerIndex = 0;
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    public GameStatus makeMove(int row, int col) {
        if (gameStatus != GameStatus.IN_PROGRESS) {
            throw new IllegalStateException("Game is already over : ");
        }

        Player currentPlayer = getCurrentPlayer();
        Piece piece = currentPlayer.getPiece();

        if (!board.placePiece(row, col, piece)) {
            throw new IllegalStateException("Invalid move: (" + row + "," + col + ") is occupied or out of bounds.");
        }

        if (strategy.checkWin(board, row, col, piece)) {
            gameStatus = (currentPlayerIndex == 0) ? GameStatus.PLAYER1_WIN : GameStatus.PLAYER2_WIN;
        } else if (board.isFull()) {
            gameStatus = GameStatus.DRAW;
        } else {
            currentPlayerIndex = (currentPlayerIndex + 1) % playerList.size();
        }
        return gameStatus;
    }

    public Player getCurrentPlayer() {
        return playerList.get(currentPlayerIndex);
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Board getBoard () {
        return board;
    }

    public void printStatus() {
        board.display();
        System.out.println("Turn: " + getCurrentPlayer());
        System.out.println("Status: " + gameStatus);
        System.out.println("─────────────────");
    }
}
