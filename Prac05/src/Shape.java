public abstract class Shape implements GeometricObject
{
    private String colour;
    private boolean filled;
    private int coVals;
    private Point centre;

    //class constructors
    public Shape()
    {
        this.colour = "red";
        this.filled = true;
        this.centre = new Point();
    }
    public Shape(String col, boolean fill)
    {
        this.colour = col;
        this.filled = fill;
        this.centre = new Point();
    }
    public Shape(String col, boolean fill, double x, double y)
    {
        this.colour = col;
        this.filled = fill;
        this.centre = new Point(x, y);
    }
    public Shape(double x, double y)
    {
        this.colour = "red";
        this.filled = true;
        this.centre = new Point(x, y);
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
        return this.centre.getX();
    }
    public double getY()
    {
        return this.centre.getY();
    }
    public Point getCentre()
    {
        return centre;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public abstract String toString();
    public abstract boolean equals(Object other);
   

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
    public void moveUp()
    {
        this.centre.moveUp();
    }
    public void moveDown()
    {
        this.centre.moveDown();
    }
    public void moveLeft()
    {
        this.centre.moveLeft();
    }
    public void moveRight()
    {
        this.centre.moveRight();
    }
    public void moveTo(Point p)
    {
        this.centre.moveTo(p);
    }
}
