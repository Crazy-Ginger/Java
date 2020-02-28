import java.util.Collection;

public interface ISet <E extends Comparable<E>>
{
    public boolean add(E add);
    public boolean addAll(Collection<E> newSet);
    public void clear();
    public boolean contains(E check);
    public boolean isEmpty();
    public boolean remove(E rem);
    public boolean removeAll(Collection<E> rem);
    public int size();
}