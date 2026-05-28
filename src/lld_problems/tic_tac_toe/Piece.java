package lld_problems.tic_tac_toe;

//PIECE  (Value Object — immutable)
public class Piece {

    private final PieceType pieceType;

    public Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    @Override
    public String toString() {
        return pieceType == PieceType.EMPTY ? "." : pieceType.name();
    }
}
