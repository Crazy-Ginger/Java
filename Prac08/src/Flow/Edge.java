package Flow;

public class Edge
{
    private int capacity, flow;
    Vertex source, destination;
    Edge reverse;

    public Edge(Vertex sour, Vertex dest, int cap)
    {
        this.source = sour;
        this.destination = dest;
        this.capacity = cap;
    }
    public Edge(Vertex sour, Vertex dest, int cap, Edge rev)
    {
        this.source = sour;
        this.destination = dest;
        this.capacity = cap;
        this.reverse = rev;
    }

    public int getCap()
    {
        return this.capacity;
    }
    public int getFlow()
    {
        return this.flow;
    }
    public Vertex getSource()
    {
        return this.source;
    }
    public Vertex getDest()
    {
        return this.destination;
    }
    public Edge getRev()
    {
        return this.reverse;
    }
    public int getResidual()
    {
        return this.capacity - this.flow;
    }

    public void setFlow(int newFlow)
    {
        this.flow = newFlow;
    }
    public boolean addFlow(int flow)
    {
        if (flow + this.flow <= this.capacity)
        {
            this.flow += flow;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other instanceof Edge)
        {
            Edge oEdge = (Edge) other;
            if ((oEdge.getSource()==this.getSource()) && (oEdge.getDest() == this.getDest()))
            {
                return true;
            }
        }
        return false;
    }
    public int hashcode()
    {
        return (this.source.hashCode() * this.destination.hashCode()) + (this.source.hashCode() + this.destination.hashCode());
    }
}