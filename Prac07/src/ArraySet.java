package tools;
import java.util.Collection;
import java.util.ArrayList;

public class ArraySet extends ISet<E>
{
    private ArrayList<E> elements;
    public ArraySet(E[] initial)
    {
        super();
        this.elements = new ArrayList<E>();
        for (int i = 0; i < initial.length; i++)
        {
            if (!contains(initial[i]))
            {
                this.elements.add(i);
            }
        }
    }
    public ArraySet(E initial)
    {
        super();
        this.elements = new ArrayList<E>(initial);
    }

    public boolean add(E add)
    {
        if (contains(add))
        {
            return false;
        }
        this.elements.add(add);
        return true;
    }
    public boolean addAll(Collection<E> add)
    {
        ArrayList<E> tmp = new ArrayList<E>();
        for (E elem : add)
        {
            if (!contains(elem))
            {
                tmp.add(elem);
            }
        }
        this.elements.addAll(tmp);
        return true;
    }

    public boolean contains(E check)
    {
        for (E elem : this.elements)
        {
            if (elem == check)
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean remove(E remov)
    {
        this.elements.remove(remov);
        return true;
    }
    //public boolean removeAll(Collection<E> remov)
    {
        this.elements.removeAll(remov);
        return true;
    }

    public void clear()
    {
        this.elements.clear();
    }
    public boolean isEmpty()
    {
        return this.elements.length == 0;
    }
    public int size()
    {
        return this.elements.length;
    }
}