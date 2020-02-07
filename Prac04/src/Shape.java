public class Shape
{
    private String colour;
    private boolean filled;
    private int coVals;

    //class constructors
    public Shape()
    {
        this.colour = "red";
        this.filled = true;
    }
    public Shape(String col, boolean fill)
    {
        this.colour = col;
        this.filled = fill;
    }

    //getters
    public String getColour()
    {
        return this.colour;
    }
    public boolean isFilled()
    {
        return this.filled;
    }
    public String isFillString()
    {
        if (this.filled)
        {
            return "Filled";
        }
        else
        {
            return "Not Filled";
        }
    }
    public int getColVals()
    {
        return this.coVals;
    }

    //setters
    public void setColour(String col)
    {
        this.colour = col;
        this.coVals = -1;
    }
    public void setFill(boolean val)
    {
        this.filled = val;
    }
    public void setColVal(int value)
    {
        this.colour = "";
        this.coVals = value;
    }
    
    @Override
    public String toString()
    {
        return "A shape with colour: " + this.colour + this.isFillString();
    }
}
