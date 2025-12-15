package TicTacToe;

public class GameSimulator {
    public static void main(String[] args){
        Game game = new Game(new Board(3), new Player('X', "Bhanu"), new Player('O',"Aditya"));
        game.play();
    }
}
