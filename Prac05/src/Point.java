public class Point
{
    public double x, y;
    
    public Point()
    {
        this.x = 0.0;
        this.y = 0.0;
    }
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    //colour get/set
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }


    @Override
    public String toString()
    {
        return "x: " + this.x + " y: " + this.y;
    }
    public boolean equals(Object other)
    {
        if (other instanceof Point)
        {
            Point cast = (Point) other;
            if (cast.getX() == this.getX() && cast.getY() == this.getY())
            {
                return true;
            }
        }
        return false;
    }
    public void moveUp()
    {
        this.y += 1;
    }
    public void moveDown()
    {
        this.y -= 1;
    }
    public void moveLeft()
    {
        this.x -= 1;
    }
    public void moveRight()
    {
        this.x += 1;
    }
    public void moveTo(Point p)
    {
        this.x = p.getX();
        this.y = p.getY();
    }
}