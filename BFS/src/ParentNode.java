import java.util.*;
 class Afs {
    static int[][] graph;
    Scanner sc = new Scanner(System.in);

    Afs() {
        ST();
    }

    void ST() {
        System.out.println("Enter Number of Vertices−");
        int N = sc.nextInt();
        graph = new int[N][N];
        System.out.println("Enter Number of Edges−");
        int e= sc.nextInt();
        Inmatrix(e);

        int vis[];
        vis = new int[N];

        for (int i = 0; i < N; i++)
        {
            vis[i] = 0;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int v=0;v<N;v++){
            vis[v] = 1;
            for(int u=0;u<N;u++){
                if (graph[u][v] == 1){
                    q.add(u);
                }
            }
            char l = (char)(v+65);
            System.out.print("Node = " + l+":");
            while (!q.isEmpty()){
                int a=q.poll();
                char g = (char)(a+65);
                System.out.print(" "+g);
            }
            System.out.println("");
        }
    }

    static void Inmatrix(int e) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter The Edges:");
        int i;
        char j, k;

        for (i = 0; i < e; i++) {

            j = sn.next().charAt(0);
            k = sn.next().charAt(0);

            graph[(int) j -65][(int) k -65] = graph[(int) k -65][(int) j -65] = 1;
        }
    }
}

 public class ParentNode {
    public static void main(String[] args) {

        Afs b = new Afs();

    }
}