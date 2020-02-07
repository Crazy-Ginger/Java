import java.lang.Math;
public class Line
{
    private Point start, end;
    private String colour;

    public Line(double sX, double sY, double eX, double eY)
    {
        start = new Point(sX, sY);
        end  = new Point(eX, eY);
        this.colour = "black";
    }

    public String getColour()
    {
        return this.colour;
    }
    public void setColour(String col)
    {
        this.colour = col;
    }

    public Point getStart()
    {
        return start;
    }
    public Point getEnd()
    {
        return end;
    }
    public double getLength()
    {
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }
    
    public void setStart(Point newPoint)
    {
        this.start = newPoint;
    }
    public void setEnd(Point newPoint)
    {
        this.end = newPoint;
    }

    @Override
    public String toString()
    {
        return "A " + this.colour + "with the start point: " +start.toString() + " and an end point: " + end.toString();
    }
}