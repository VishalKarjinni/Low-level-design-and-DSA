package lld_problems.tic_tac_toe;
// 3. Player (Entity Holds identity + piece)
public class Player {
    private String name;
    private Piece piece;

    public Player(String name, PieceType pieceType) {
        this.name = name;
        this.piece = new Piece(pieceType);
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    @Override
    public String toString() {
        return name + " (" + piece + ") ";
    }
}
