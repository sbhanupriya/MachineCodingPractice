package TicTacToe;

import TicTacToe.computer.PlayingStrategy;

import java.util.Scanner;

public class ComputerAssistedPlayer extends  Player {
    private Board board;
    private PlayingStrategy playingStrategy;
    public ComputerAssistedPlayer(PlayingStrategy playingStrategy, Board board, String name, Character ch){
        super(ch, name);
        this.playingStrategy = playingStrategy;
        this.board = board;
    }
    @Override
    public int[] move(){
        System.out.println("System anlaysed best moves as - "  + playingStrategy.analyse(board, character));
        Scanner scanner = new Scanner(System.in);
        Integer x = scanner.nextInt();
        Integer y = scanner.nextInt();
        return new int[]{x,y};
    }

}
