public class Triangle extends Shape
{
    private double a, b, c;   
    private double A, B, C;

    public Triangle()
    {
        super();
        a = 1;
        b = 1;
        c = 1;
        A= 60;
        B = 60;
        C = 60;
    }
    public Triangle(String colour, boolean fill)
    {
        super(colour, fill);
        a = 1;
        b = 1;
        c = 1;
        A= 60;
        B = 60;
        C = 60;
    }
    public Triangle(double aIN, double bIN, double cIN)
    {
        super();
        a = aIN;
        b = bIN;
        c = cIN;
    }
}