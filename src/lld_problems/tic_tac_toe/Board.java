package lld_problems.tic_tac_toe;

import java.util.Arrays;

public class Board {
    private final int size;
    private final Piece[][] grid;

    public Board(int size) {
        this.size = size;
        this.grid = new Piece[size][size];

        for (Piece[] row :grid) {
            Arrays.fill(row, new Piece(PieceType.EMPTY));
        }
    }

    public Piece getPiece(int row, int col) {
        return grid[row][col];
    }

    public int getBoardSize() {
        return size;
    }

    public boolean isValidCell(int row, int col) {
       return row >= 0 && row < size && col >= 0 && col < size;
    }

    public boolean isEmpty(int row, int col) {
        return grid[row][col].getPieceType() == PieceType.EMPTY;
    }

    public boolean placePiece(int row, int col, Piece piece) {
         if (!isValidCell(row, col) || !isEmpty(row, col)) return false;
         grid[row][col] = piece;
         return true;
    }

    public boolean isFull() {
        for (Piece[] row:grid) {
            for (Piece cell : row) {
                if (cell.getPieceType() == PieceType.EMPTY) return false;
            }
        }
        return true;
    }

    /** Display the board on console */
    public void display() {
        System.out.print("  ");
        for (int c = 0; c < size; c++) System.out.print(c + " ");
        System.out.println();
        for (int r = 0; r < size; r++) {
            System.out.print(r + " ");
            for (int c = 0; c < size; c++)
                System.out.print(grid[r][c] + " ");
            System.out.println();
        }
    }


}
