public class Rectangle extends Shape
{
    private double width, length;
    public Rectangle()
    {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(String col, boolean fill)
    {
        super(col, fill);
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(String col, boolean fill, double wid, double leng)
    {
        super(col, fill);
        this.width = wid;
        this.length = leng;
    }
    public Rectangle(double wid, double leng)
    {
        super();
        this.width = wid;
        this.length = leng;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getLength()
    {
        return this.length;
    }
    public double getArea()
    {
        return this.width*this.length;
    }
    public double getPerimiter()
    {
        return (2*this.width)+(2*this.length);
    }

    public void setWidth(double wid)
    {
        this.width = wid;
    }
    public void setLength(double leng)
    {
        this.length = leng;
    }

    @Override
    public String toString()
    {
        return "A rectangle with width: " + this.width + " & length: " + this.length + " which is a subclass of: " + super.toString();
    }
}