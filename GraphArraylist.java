import java.util.*;


class Graph {

  ArrayList<ArrayList<Integer>> graph; 
  int V;

  Graph(int nodes) {

    V = nodes;
    graph = new ArrayList<ArrayList<Integer>>();

    for (int i = 0; i < V; i++) {
      graph.add(new ArrayList<Integer>()); 
    }
  }

  void Edge(int v, int u) {

    graph.get(v).add(u);
    graph.get(u).add(v);
  }

  void printGraph() {

    for (int i = 0; i < V; i++) { 
      System.out.print("Node " + i);
      for (int j : graph.get(i))
        System.out.print(" ->" + j);
      System.out.println();

    }
  }

}

public class Graph1 {

  public static void main(String[] args) {

    Graph g = new Graph(5);
    g.Edge(0, 2);
    g.Edge(2, 4);
    g.Edge(1, 3);
    g.Edge(4, 3);
    g.Edge(3, 2);

    g.printGraph();

  }
}
