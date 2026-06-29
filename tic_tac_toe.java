import java.util.*;
class TicTacToe
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        char board[][] = {{ ' ',' ',' '}, { ' ',' ',' '}, { ' ',' ',' '}};

        char player = 'x';
        boolean flag = true;
        int i,j,row,col,moves=0;
//--------------------------------PRINT THE BOARD--------------------------------------
        while(flag)
        {
            System.out.println("-----------TIC-TAC-TOE-----------");
            for(i = 0;i<board.length;i++)
            {
                System.out.println("-------------");

                for(j=0;j<board.length;j++)
                {
                    System.out.print("|  " +board[i][j]);
                }
                System.out.println("|");
            }
            System.out.println("-------------");

//---------------------TAKE THE VALUES FROM THE USER------------------------------------
            System.out.println("Current Player "+player+" Is Playing...!!");

            System.out.println("Enter The Row Number:");
            row = sc.nextInt();

            if(row<1||row>3)
            {
                System.out.println("Invalide Row");
                continue;
            }

            System.out.println("Enter The col Number:");
            col = sc.nextInt();

            if(col<1||col>3)
            {
                System.out.println("Invalide Col");
                continue;
            }

            if(board[row-1][col-1]!=' ')
            {
                System.out.println("Position Is Already Filled!");
                continue;
            }

            board[row-1][col-1] = player;
            moves++;

//--------------------------------WINNING CONDITIONS--------------------------------------
            for(i=0;i<board.length;i++)
            {
                if((board[i][0]==player&& 
                board[i][1]==player && 
                board[i][2]==player)||
                (board[0][i]==player && 
                board[1][i]==player&&
                board[2][i]==player))
                {
                    System.out.println("player "+player+" Wins!");
                    flag = false;
                    break;
                }
            }

//--------------------------------DRAW CONDITION--------------------------------------
              if(moves==9)
              {
                System.out.println("Its Draw");
                break;
              }       

//--------------------------------CHANGE THE PLAYER--------------------------------------
            if(player=='x')
            {
                player = 'o';
            }
            else
            {
                player ='x';
            }
        }     
    }
}