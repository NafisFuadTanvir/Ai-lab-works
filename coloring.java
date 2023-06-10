package p;

import java.util.Scanner;

public class coloring {

    int V,numofcolors;
    int [] color;
    int [][] graph;

    void graphcolor(int[][]g,int noc){
        V=g.length;
        color=new int[V];
        graph=g;
        numofcolors=noc;


        try{
            solve(0);
            System.out.println("solution not found");
        }
        catch (Exception e){
            System.out.println("Solution excist");
            display();
        }
    }

    void solve(int v) throws Exception{
        if(v==V)
            throw new Exception("solution found");

        for(int c=1;c<numofcolors;c++){
            if(ispossible(v,c)){
                color[v]=c;
                solve(v+1);
                color[v]=0;
            }
        }
    }


    boolean ispossible(int v,int c){
        for(int i=0;i<V;i++)
            if(graph[v][i]==1 && c==color[i])
                return false;
            return true;
        }

        void display() {

            String[] textcolor = {"red", "green", "blue"};
            System.out.println("colors:- ");
            for (int i = 0; i < V; i++) {
                System.out.println(textcolor[color[i]]);
            }
            System.out.println();
        }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        coloring gc= new coloring();

        System.out.println("enter the vertices:- ");
        int V= sc.nextInt();
        System.out.println("enter the graph:- ");
        int [][] graph= new int[V][V];

        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){

                graph[i][j]= sc.nextInt();
            }
        }
        System.out.println("entr the number of colors:- ");
        int c= sc.nextInt();

        gc.graphcolor(graph,c);
    }
}
