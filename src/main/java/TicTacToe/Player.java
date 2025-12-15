package TicTacToe;

import java.util.Scanner;

public class Player {
    protected Character character;
    private  String name;
    public Player(Character ch, String name){
        character = ch;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int[] move(){
        Scanner scanner = new Scanner(System.in);
        Integer x = scanner.nextInt();
        Integer y = scanner.nextInt();
        return new int[]{x,y};
    }
}
