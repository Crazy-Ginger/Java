public class Square extends Rectangle
{
    public Square()
    {
        super();
    }
    public Square(String cols, boolean fill)
    {
        super(cols, fill);
    }
    public Square(double side)
    {
       super(side, side);
    }
    public Square(String cols, boolean fill, double side)
    {
       super(cols, fill, side, side);
    }

    public double getSide()
    {
        return super.getLength();
    }
    public void setSide(double side)
    {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side)
    {
        super.setLength(side);
        super.setWidth(side);
    }
    public void setLength(double side)
    {
        super.setLength(side);
        super.setWidth(side);
    }
    

    public String toString()
    {
        return "Square with side: " + super.getLength() + " which is subclass of: " + super.toString();
    }
    public boolean equals(Object other)
    {
        if (other instanceof Square)
        {
            Square cast = (Square) other;
            if (cast.getX() == this.getX() && cast.getY() == this.getY() && cast.getSide() == this.getSide())
            {
                return true;
            }
        }
        return false;
    }
}