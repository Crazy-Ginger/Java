package tools;
import java.util.Collection;

public interface ISet <E extends Comparable<E>>
{
    public boolean add(E add);
    public boolean addAll(Collection<E> addSet);
    public void clear();
    public boolean contains(E check);
    public boolean isEmpty();
    public boolean remove(E rem);
    public boolean removeAll(Collection<E> remSet);
    public int size();
}