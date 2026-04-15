package lld_problems.tic_tac_toe;

//Player (Abstraction)
//Why?
//So we can extend Human / Bot without modifying Game.

public abstract class Player {
    protected String name;
    protected char symbol;

    public Player (String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

//    public abstract Move makeMove(Board board);
}
