package TicTacToe.computer;

import TicTacToe.Board;
import TicTacToe.Player;

public class Computer extends Player {
    private PlayingStrategy playingStrategy;
    private Board board;
    public Computer(Character character, PlayingStrategy strategy, Board board){
        super(character, "COMPUTER");
        playingStrategy = strategy;
        this.board = board;
    }
    @Override
    public int[] move() {
        return playingStrategy.analyse(board,this.character);
    }
}
