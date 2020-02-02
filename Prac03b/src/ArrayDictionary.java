public class ArrayDictionary
{
    private int[] keys;
    private String[] vals;
    public ArrayDictionary ()
    {
        this.keys = new int[100];
    }

    public ArrayDictionary(int size)
    {
        this.keys = new int[size];
    }

    public String toString()
    {
        StringBuilder out = new StringBuilder();
        out.append("[");
        for (int i = 0; i < this.keys.length-1; i++)
        {
            out.append(this.keys[i] + ", ");
        }
        out.append(this.keys[this.keys.length-1] + "]");
        return out.toString();
    }


    public static void main(String[] args)
    {
        ArrayDictionary tester = new ArrayDictionary();
    }
}

