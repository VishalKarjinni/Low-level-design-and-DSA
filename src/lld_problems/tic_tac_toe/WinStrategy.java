package lld_problems.tic_tac_toe;

public interface WinStrategy {
    boolean checkWin(Board board, int row, int col, Piece piece);
}
