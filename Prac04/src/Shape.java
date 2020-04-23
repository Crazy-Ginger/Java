public class Shape
{
    private String colour;
    private boolean filled;
    private int coVals;
    private double centreX, centreY;

    //class constructors
    public Shape()
    {
        this.colour = "red";
        this.filled = true;
        this.centreX = 0;
        this.centreY = 0;
    }
    public Shape(String col, boolean fill)
    {
        this.colour = col;
        this.filled = fill;
        this.centreX = 0;
        this.centreY = 0;
    }
    public Shape(String col, boolean fill, double x, double y)
    {
        this.colour = col;
        this.filled = fill;
        this.centreX = x;
        this.centreY = y;
    }
    public Shape(double x, double y)
    {
        this.colour = "red";
        this.filled = true;
        this.centreX = x;
        this.centreY = y;
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
    public double getX()
    {
        return this.centreX;
    }
    public double getY()
    {
        return this.centreY;
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
    public void setX(double x)
    {
        this.centreX = x;
    }
    public void setY(double y)
    {
        this.centreY = y;
    }    
    public void setCentre(double x, double y)
    {
        this.centreX = x;
        this.centreY = y;
    }

    @Override
    public String toString()
    {
        return "A shape with colour: " + this.colour + this.isFillString();
    }
}
