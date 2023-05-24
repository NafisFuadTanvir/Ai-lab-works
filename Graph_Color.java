
import java.util.*;
public class Graph_Color {
    int V,numOfColors;
    int color[];
    int graph[][];
    public void coloringgraph(int [][]g,int noc)
    {
        V= g.length;
        numOfColors=noc;
        color= new int[V];
        graph=g;

        try{
            solution(0);
            System.out.println("no solution");
        }
        catch (Exception e){
            System.out.println("solution ache");
            display();
        }

    }

    public void solution(int v) throws Exception{

        if(v==V){
            throw new Exception("solution found");
        }
        for(int c=0;c<numOfColors;c++){

          if(ispossible(v,c)){
              color[v]=c;
              solution(v+1);
              color[v]=0;
          }

        }
    }

    public boolean ispossible(int v,int c){
        for(int i=0;i<V;i++){ //eykhaner v ta niye confused

            if(graph[v][i]==1 && c==color[i]){
                return false;
            }

        }
        return true;
    }

 public void display(){

        String textcolor[]={"RED","GREEN","BLUE"};

     System.out.print("\nColors:- ");
     for(int i=0;i<V;i++){
         System.out.print(textcolor[color[i]] + " ");
     }
     System.out.println();

 }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Gp coloring algo testing:- ");
        Graph_Color gc= new Graph_Color();
        System.out.println("enter the number of vertices:- ");
        int V= sc.nextInt();

        System.out.println("enter the matrix:- ");
        int graph[][]= new int[V][V];
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                graph[i][j]= sc.nextInt();
            }
        }

        System.out.println("enter number of colors:- ");
        int c= sc.nextInt();

        gc.coloringgraph(graph,c);

    }
}
