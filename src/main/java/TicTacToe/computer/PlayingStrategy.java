package TicTacToe.computer;

import TicTacToe.Board;

public interface PlayingStrategy {
  int[] analyse(Board board, Character character);
}
