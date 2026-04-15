package lld_problems.tic_tac_toe;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

//    @Override
//    public Move makeMove(Board board) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(name + " Enter row and column : ");
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        return new Move(row, col);
//    }
}
