import java.util.*;
public class N_Queen {

    int N;

    N_Queen(int a){
        N=a;
    }

    void printSolution(int board[][]){

            for(int i=0;i<N;i++){

                for(int j=0;j<N;j++){
                    System.out.print(" "+board[i][j]+ "");
                }
                System.out.println();

            }
    }

    boolean isSafe(int grid[][],int row,int col){
   int i,j;

   for(i=0;i<col;i++){
       if(grid[row][i]==1){
           return false;
       }
   }

   for(i=row,j=col;i>=0 && j>=0;i--,j--){

       if(grid[i][j]==1){
           return  false;
       }
        }

        for(i=row,j=col; j>=0 && i<N;i++,j--){

            if(grid[i][j]==1){
                return  false;
            }
        }




   return true;
    }

    boolean solveNQutil(int grid[][],int col){


        if(col>=N){
            return  true;
        }

        for(int i=0;i<N;i++){

            if(isSafe(grid,i,col)){
                grid [i][col]=1;

                if(solveNQutil(grid,col+1)==true){
                    return true;
                }
                grid[i][col]=0;
            }  //ey kane


        }

        return false;
    }


    boolean solveNQ(){
        int grid [][]=new int[N][N];

        if(solveNQutil(grid,0)==false){
            System.out.println("solution does not exist");
            return false;
        }

        System.out.println("solution found");
        printSolution(grid);
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Number of queens to place:- ");
        n= sc.nextInt();
        N_Queen queen= new N_Queen(n);
        queen.solveNQ();
    }

}