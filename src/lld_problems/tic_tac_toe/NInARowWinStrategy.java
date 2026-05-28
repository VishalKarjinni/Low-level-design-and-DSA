package lld_problems.tic_tac_toe;

public class NInARowWinStrategy implements WinStrategy{
    @Override
    public boolean checkWin(Board board, int row, int col, Piece piece) {
        return checkRow(board, row, piece)
                || checkCol(board, col, piece)
                || checkDiagonal(board, piece)
                || checkAntiDiagonal(board, piece);
    }

    public boolean checkRow(Board board, int row, Piece piece) {
        for (int c = 0; c < board.getBoardSize(); c++) {
            if (board.getPiece(row, c).getPieceType() != piece.getPieceType()) return false;
        }
        return true;
    }

    public boolean checkCol(Board board, int col, Piece piece) {
        for (int r = 0; r < board.getBoardSize(); r++) {
            if (board.getPiece(r, col).getPieceType() != piece.getPieceType()) return false;
        }
        return true;
    }

    public boolean checkDiagonal(Board board, Piece piece) {
        for (int i = 0; i < board.getBoardSize(); i++) {
            if (board.getPiece(i, i).getPieceType() != piece.getPieceType()) return false;
        }
        return true;
    }

    public boolean checkAntiDiagonal(Board board, Piece piece) {
        int n = board.getBoardSize();
        for (int i = 0; i < n; i++) {
            if (board.getPiece(i, n - 1- i).getPieceType() != piece.getPieceType()) return false;
        }
        return true;
    }
}
