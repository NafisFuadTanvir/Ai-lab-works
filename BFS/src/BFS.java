import java.util.*;
public class BFS {
    static int[][] graph;
    Scanner sc = new Scanner(System.in);

    BFS() {
        ST();
    }

    void ST() {
        System.out.println("Enter Number of Vertices−");
        int N = sc.nextInt();
        graph = new int[N][N];
        System.out.println("Enter Number of Edges−");
        int e= sc.nextInt();
        Inmatrix(e);

        int vis[], lev[];
        vis = new int[N];
        lev = new int[N];

        for (int i = 0; i < N; i++)
        {
            vis[i] = 0;
            lev[i] = 999999;
        }
        int s = 0;
        vis[s] = 1;
        lev[s] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(s);

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v = 0; v < N; v++) {
                if (graph[u][v] == 1 && vis[v] == 0)
                {
                    vis[v] = 1;
                    lev[v] = lev[u] + 1;
                    q.add(v);
                }
            }
            vis[u] = 2;
        }
        for (int i = 0; i < N; i++) {
            System.out.println("Node = " + i + " Level = " + lev[i]);
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

class BfsTravarse {
    public static void main(String[] args) {

        BFS b = new BFS();

    }
}