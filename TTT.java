import java.util.Scanner;
class Main{
    public static void main(String[] args){
        char board[][]=new char[3][3];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                board[row][col]=' ';
            }
        }
        char player='x';
        boolean gameover=false;
        Scanner var=new Scanner(System.in);
        while(!gameover){
            printboard(board);
            System.out.println("Player"+player+"enter:");
            int row=var.nextInt();
            int col=var.nextInt();
            if(board[row][col]==' '){
                board[row][col]=player;
                gameover=havewon(board,player);
            if(gameover){
                System.out.println("Player"+player+"has won");
            }
            else{
                if(player=='x'){
                    player='o';
                }
                else{
                    player='x';
                }
            }
            }
            else{
                System.out.println("Not possible");
            }
 
        }
        printboard(board);
    }
    public static boolean havewon (char[][] board,char player){
        //check rows
        for(int row=0;row<board.length;row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }
        //check col
        for(int col=0;col<board.length;col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }
        //check diagonals
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }
        return false;
    }
    public static void printboard(char[][] board){
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                System.out.print(board[row][col]+"||");
            }
            System.out.println();
        }

    }
}