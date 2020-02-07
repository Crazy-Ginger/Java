public class Point
{
    public double x, y;
    private String colour;
    
    public Point()
    {
        this.x = 0.0;
        this.y = 0.0;
        this.colour = "black";
    }
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.colour = "black";
    }

    //colour get/set
    public String getColour()
    {
        return this.colour;
    }
    public void setColour(String col)
    {
        this.colour = col;
    }
    
    @Override
    public String toString()
    {
        return "x: " + this.x + " y: " + this.y + " of colour: " + this.colour; 
    }
}