package Flow;
public class Vertex
{
    private String id;
    private int flag;
    public Vertex(String name)
    {
        this.id = name;
        this.flag = 0;
    }
    public Vertex(String name, int val)
    {
        this.id = name;
        this.flag = val;
    }

    public String getId() 
    {
        return this.id;
    }
    public int getFlag() 
    {
        return this.flag;
    }
    public void setFlag(int val)
    {
        this.flag = val;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other instanceof Vertex)
        {
            Vertex o
        }
        return false;
    }
}