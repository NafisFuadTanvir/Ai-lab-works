package p;

import java.util.Scanner;

public class Graphcoloring {


    int V,numofcolors;
    int []color;
    int [][]graph;


    void graphcolor(int[][]g,int noc){
        V=g.length;
        color= new int[V];
        numofcolors=noc;
        graph=g;

        try{
            solve(0);
            System.out.println("solution not found");
        }
        catch (Exception e){
            System.out.println("solution found");
            display();
        }

    }

    void solve(int v) throws Exception{
        if(v==V)
            throw new Exception("solution found");

        for(int c=1;c<numofcolors;c++){
            if(isSet(v,c)){
                color[v]=c;
                solve(v+1);
                color[v]=0;
            }
        }

    }
    boolean isSet(int v,int c){
        for(int i=0;i<V;i++)
            if(graph[v][i]==1 && c==color[i])
                return false;
            return true;

    }


    void display(){
        String [] textcolor= {"","red","green","blue","yellow","orange","pink"};

        for(int i=0;i<V;i++){
            System.out.println(textcolor[color[i]]+"");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Graphcoloring gc= new Graphcoloring();
        System.out.println("enter number of vertices:- ");

       int V= sc.nextInt();


        System.out.println("enter the graph:- ");
        int [][] graph= new int[V][V];
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                graph[i][j]= sc.nextInt();
            }
        }

        System.out.println("enter the number of colors:- ");
        int c= sc.nextInt();

        gc.graphcolor(graph,c);
    }
}
