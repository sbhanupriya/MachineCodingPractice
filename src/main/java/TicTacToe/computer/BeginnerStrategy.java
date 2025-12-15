package TicTacToe.computer;

import TicTacToe.Board;

public class BeginnerStrategy implements PlayingStrategy {
    @Override
    public int[] analyse(Board board, Character character) {
        return new int[]{0,0};
    }
}
