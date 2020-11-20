package graphs;

import java.util.ArrayList;
import java.util.List;

 class Node {
    private List<Node> neighbours;
    State state;
    int data;

     public Node(int data) {
         this.neighbours = new ArrayList<>();
         this.state = State.NOT_VISITED;
         this.data = data;
     }

     public List<Node> getNeighbours() {
         return neighbours;
     }

     public State getState() {
         return state;
     }

     public int getData() {
         return data;
     }

     public void addNeighbour(Node neighbour) {
       neighbours.add(neighbour);
     }

     public void setState(State state) {
         this.state = state;
     }

     public void setData(int data) {
         this.data = data;
     }
 }
public class Graph{
     List<Node> nodes;

    public Graph(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void addNodes(Node node) {
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }
}
 enum State{
NOT_VISITED,
     VISTING,
     VISITED}
