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
        return "A " + this.colour + " line with the start point: " +start.toString() + " and an end point: " + end.toString() + "\n";
    }
    public boolean eqauls(Object other)
    {
        if (other instanceof Line)
        {
            Line cast = (Line) other;
            if (this.start.equals(cast.getStart()) && this.end.equals(cast.getEnd()))
            {
                return true;
            }
        }
        return false;
    }
    public void moveUp()
    {
        start.moveUp();
        end.moveUp();
    }
    public void moveDown()
    {
        start.moveDown();
        end.moveDown();
    }
    public void moveLeft()
    {
        start.moveLeft();
        end.moveLeft();
    }
    public void moveRight()
    {
        start.moveRight();
        end.moveRight();
    }
    public void moveTo(Point p)
    {
        Point offset = new Point(p.getX() + (end.getX() - start.getX()), p.getY() + (end.getY() - start.getY()));
        end.moveTo(offset);
        start.moveTo(p);
    }

    
    public static void main(String[] args)
    {
        Line li = new Line(3, 3, 4, 4);
        System.out.print(li.getLength()+ "\n");
        System.out.print(li);

        Point po = new Point(2,2);
        li.moveTo(po);
        System.out.print(li);
        System.out.print(li.getLength());
    }
}