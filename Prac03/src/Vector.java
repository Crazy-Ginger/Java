public class Vector
{
    private double[] params;

    public Vector (double[] args)
    {
        this.params = args.clone();
    }

    public String toString()
    {
        StringBuilder out = new StringBuilder();
        if (this.params.length < 1)
        {
            return "";
        }
        out.append("[ ");
        for (int i = 0; i < this.params.length; i++)
        {
            out.append(this.params[i]);
            if (i != this.params.length -1)
            {
                out.append(", ");
            }
        }
        out.append("]");
        return out.toString();
    }

    public int size()
    {
        return this.params.length;
    }

    public double get(int index)
    {
        if (index < this.params.length)
        {
            return this.params[index];
        }
        return 0;
    }

    public void set(int index, double value)
    {
        if (index < this.params.length)
        {
            this.params[index] = value;
        }
    }

    public Vector scalarProduct(double scalar)
    {   
        double[] newParams = this.params.clone();
        for (int i = 0; i < newParams.length; i++)
        {
            newParams[i] = newParams[i] * scalar;
        }
        return new Vector(newParams);
    }

    public Vector add(Vector other)
    {
        if (this.params.length != other.params.length)
        {
            return null;
        }
        double[] newParams = new double[this.params.length];
        for (int i = 0; i < this.params.length; i++)
        {
            newParams[i] = this.params[i] + other.get(i);
        }
        return new Vector(newParams);
    }

    public boolean equals(Object other)
    {
        
        if (other instanceof Vector)
        {
            Vector othV = (Vector) other;
            if (this.params.length == othV.size())
            {
                for (int i = 0; i < this.size(); i++)
                {
                    if (this.params[i] != othV.get(i))
                    {
                        return false;
                    }
                }
                return true;
            }
            else
            {
                return false;
            }
        }

        else 
        {
            return false;
        }
    }

    public static void main()
    {
        Vector a = new Vector(new double[] {2.0, 3.0, 4.0});
        System.out.println(a);
        System.out.println("Running Vector now");

        // Vector b = new Vector(new double[] {4.0, 3.0, 2.0});
        // System.out.println(b.toString());
        // Vector c = a.add(b);
        // System.out.println(c.toString());
    }
}
