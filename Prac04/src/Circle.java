public class Circle extends Shape
{
    private double radius;

    public Circle()
    {
        super();
        this.radius = 1.0;
    }
    public Circle(String col, boolean fill)
    {
        super(col, fill);
        this.radius = 1.0;
    }
    public Circle(String col, boolean fill, double rad)
    {
        super(col, fill);
        this.radius = rad;
    }

    public double getRadius()
    {
        return this.radius;
    }
    public double getArea()
    {
        return 3.14159265359*(this.radius*this.radius);
    }
    public double getPerimiter()
    {
        return 3.14159265359*(2*this.radius);
    }

    public void setRadius(double rad)
    {
        this.radius = rad;
    }

    @Override
    public String toString()
    {
        return "A circle with radius: " + this.radius + "which is a subclass of: " + super.toString();
    }
}