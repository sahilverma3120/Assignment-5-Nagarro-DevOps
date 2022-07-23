import java.util.ArrayList;
import java.util.Scanner;

class vertex {
    int x;
    int y;

    vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class SasmungInterviewQuestion {

    public static int distance(vertex src, vertex dest) {
        return Math.abs(src.x - dest.x) + Math.abs(src.y - dest.y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc != 0){
        ArrayList<vertex> vertexList = new ArrayList<vertex>();
        int num_holes = sc.nextInt();
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        vertexList.add(new vertex(sx, sy));

        int dx = sc.nextInt();
        int dy = sc.nextInt();
        vertex dest_node = new vertex(dx, dy);

        


        int graph[][] = new int[num_holes * 2 + 2][num_holes * 2 + 2];


        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                graph[i][j] = -1;
            }
        }

        int graphIndex = 1;
        for (int i = 0; i < num_holes; i++) {

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            vertex hole_start = new vertex(x1, y1);
            vertexList.add(hole_start);


            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            vertex hole_end = new vertex(x2, y2);
            vertexList.add(hole_end);

            int dist = sc.nextInt();


            graph[graphIndex][graphIndex + 1] = graph[graphIndex + 1][graphIndex] = dist;
            graphIndex += 2;
        }

        vertexList.add(dest_node);
        

        for (int i = 0; i < graph.length; i++) {
            graph[0][i] = distance(vertexList.get(0), vertexList.get(i));
            graph[graph.length - 1][i] = distance(vertexList.get(graph.length - 1), vertexList.get(i));
        }


        for (int i = 1; i < graph.length - 1; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (i == j)
                    graph[i][j] = 0;
                else if (graph[i][j] == -1) {
                    if (i % 2 == 1) {
                        graph[i][j] = graph[i][i + 1] + distance(vertexList.get(i + 1), vertexList.get(j));
                    } else
                        graph[i][j] = graph[i][i - 1] + distance(vertexList.get(i - 1), vertexList.get(j));
                }
            }
        }
        graph[0][graph.length - 1] = graph[graph.length - 1][0] = distance(vertexList.get(0),
                vertexList.get(vertexList.size() - 1));


        boolean visited[] = new boolean[num_holes * 2 + 2];

        getMinDistance(graph, 0, graph.length - 1, visited, 0);
        System.out.println(ans);
        tc--;
        ans = Integer.MAX_VALUE;
    }
    sc.close();
    
}

    public static int ans = Integer.MAX_VALUE;

    private static void getMinDistance(int[][] graph, int cur_vertex, int fin_vertex, boolean[] visited, int cur_dist) {
        if (cur_vertex == fin_vertex) {
            ans = Math.min(ans, cur_dist);
            return;
        }
        if (visited[cur_vertex])
            return;
        visited[cur_vertex] = true;

        for (int i = 0; i < graph.length; i++) {
            getMinDistance(graph, i, fin_vertex, visited, cur_dist + graph[cur_vertex][i]);
        }
        visited[cur_vertex] = false;

    }
}
