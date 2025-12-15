package TicTacToe;

public class Board {
    private Character[][] board;
    private int size;
    private Character lastCharacter;
    private int availableSpots;
    public Board(int n){
        size = n;
        board = new Character[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++)
               board[i][j] = '-';
            System.out.println();
        }
        availableSpots = n*n;
    }
    public void print(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++)
                System.out.print(board[i][j]+ " ");
            System.out.println();
        }
    }
    public boolean isAvailable(){
        return availableSpots!=0;
    }
    public void mark(int row, int col, Character character){
        if(board[row][col]!='-')
            throw new RuntimeException("Already filled spot!! Choose any other space");
        board[row][col] = character;
        lastCharacter = character;
        availableSpots--;
    }
    public boolean isSuccess(){
        int rowCount = 0;
        int colCount = 0;
        int leftDiagonal = 0;
        for(int i=0;i<size;i++){
            colCount = 0;
            rowCount = 0;
            if(board[i][i]==lastCharacter)
                leftDiagonal++;
            for(int j=0;j<size;j++){
                if(board[j][i]==lastCharacter)
                    colCount++;
                if(board[i][j]==lastCharacter)
                    rowCount++;
            }
            if(rowCount==size || colCount==size)
                return true;
        }
        return false;
    }
}
