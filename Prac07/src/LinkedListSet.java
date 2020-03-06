package tools;
import java.utils.Collection;
import java.utils.ArrayList;
import java.lang.StringBuilder;

public class LinkedListSet extends ISet<E>
{
    private class Node 
    {
        private E value;
        private Node next;
        
        public Node(E val)
        {
            this.value = val;
            this.next = null;
        }
        public Node(E val, Node nex)
        {
            this.value = val;
            this.next = nex;
        }
        E getVal()
        {
            return this.value;
        }
        Node getNext()
        {
            return this.next;
        }
        void setVal(E newVal)
        {
            this.value = newVal;
        }
        void setNext(Node newNext)
        {
            this.next = newNext;
        }
    }
    
    Node head;
    Node tail;
    public LinkedListSet(E val)
    {
        super();
        head = new Node(val);
        tail = head;
    }
    public LinkedListSet(Collection<E> vals)
    {
        super();
        head = new Node(vals[0]);
        Node current = new Node(vals[1]);
        head.setNext(current);
        Node previous;
        for (int i = 2; i < vals.length - 1; i++)
        {
            previous = current;
            current = new Node(vals[i]);
            previous.setNext(current);
        }
        this.tail = new Node(vals[vals.length-1], null);
        current.setNext(this.tail);
    }

    public boolean add(E addVal)
    {
        if (contains(add))
        {
            return false;
        }
        Node adder = new Node(addVal);
        this.tail.setNext(adder);
        this.tail = adder;
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
        Node current = this.head;
        while (current.getNext() != null)
        {
            if (current.getVal() == check)
            {
                return false;
            }
            current = current.getNext();
        }
        return false;
    }
    
    public boolean remove(E remov)
    {
        this.elements.remove(remov);
        return true;
    }
    public boolean removeAll(Collection<E> remov)
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

    public Strin toString()
    {
        StringBuilder builder = new StringBuilder();
        Node current = head;
        while (current.getNext() != null)
        {
            builder.append(current.getVal() + ", ");
            current = current.getNext();
        }
        return builder.toString();
    }
}