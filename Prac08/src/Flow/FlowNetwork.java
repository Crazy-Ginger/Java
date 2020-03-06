package Flow;
import java.util.List;
import java.util.Map;

public class FlowNetwork
{
    public int UNVISITED = 0;
    public int VISUTED = 1;
    public int BEING_PROCESSED = 2;
    private Map<Vertex, List<Edge>> graph;
    private List<Vertex> verticies;

    public boolean addVertex(Vertex v)
    {
        if (!(this.verticies.contains(v)))
        {
            this.verticies.add(v);
        }
        return false;
    }
    public boolean addEdge(Vertex source, Vertex dest, int capacity)
    {
        Edge newEd = new Edge(source, dest, capacity);
        if (this.graph.containsKey(source))
        {
            if (!(this.graph.get(source).contains(newEd)))
            {
                this.graph.get(source).add(newEd);
            }
        }
        return false;
    }
    public boolean contains(Vertex v)
    {
        return this.verticies.contains(v);
    }
    public boolean contains(Edge e)
    {
        return this.graph.get(e.getSource()).contains(e);
    }
}