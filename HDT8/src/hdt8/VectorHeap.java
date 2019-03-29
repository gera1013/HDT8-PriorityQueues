package hdt8;

import java.util.Vector;

/**
 *
 * @author Gerardo
 * @param <E>
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> 
{
    protected Vector<E> data;
    
    public VectorHeap()
    {
        data = new Vector();
    }
    
    public VectorHeap(Vector<E> v)
    {
        int i;
        data = new Vector(v.size());
        for(i = 0; i < v.size(); i++)
        {
            add(v.get(i));
        }
    }
    
    protected static int parent(int i)
    {
        return (i-1)/2;
    }
    
    protected static int left(int i)
    {
        return 2*i+1;
    }
    
    protected static int right(int i)
    {
        return 2*(i+1);
    }
    
    protected void percolateUp(int leaf)
    {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while(leaf > 0 && (value.compareTo(data.get(parent))) < 0)
        {
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf, value);
    }

    @Override
    public E getFirsr() 
    {
        return data.get(0);
    }

    @Override
    public E remove() 
    {
        return data.remove(0);
    }

    @Override
    public void add(E value) 
    {
        data.add(value);
        percolateUp(data.size()-1);
    }

    @Override
    public boolean isEmpty() 
    {
        return data.isEmpty();
    }

    @Override
    public int size() 
    {
        return data.size();
    }

    @Override
    public void clear() 
    {
        data.clear();
    }
    
}
