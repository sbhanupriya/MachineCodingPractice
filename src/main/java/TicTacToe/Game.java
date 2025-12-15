package TicTacToe;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player[] players;
    public Game(Board board, Player player1, Player player2){
        this.board = board;
        this.players = new Player[2];
        this.players[0] = player1;
        this.players[1] = player2;
    }
    public void play(){
        int turn = 0;
        board.print();
        while(board.isAvailable()){
            System.out.println("Player " + players[turn].getName() + " make a move ");
            int[] coordinates = players[turn].move();
            board.mark(coordinates[0], coordinates[1], players[turn].character);
            if(board.isSuccess()){
                System.out.println("Player " + players[turn].getName() +  " has won!! Game Ended");
                break;
            }
            turn = (++turn)%2;
            board.print();
        }
        if(board.isAvailable()==false)
            System.out.println("Game drawn!! No one won");
    }
}
