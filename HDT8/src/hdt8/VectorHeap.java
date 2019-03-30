//package hdt8;

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
    
    /**
     *
     * @param v
     */
    public VectorHeap(Vector<E> v)
    {
        int i;
        data = new Vector(v.size());
        for(i = 0; i < v.size(); i++)
        {
            add(v.get(i));
        }
    }
    
    /**
     *
     * @param i
     * @return
     */
    protected static int parent(int i)
    {
        return (i-1)/2;
    }
    
    /**
     *
     * @param i
     * @return
     */
    protected static int left(int i)
    {
        return 2*i+1;
    }
    
    /**
     *
     * @param i
     * @return
     */
    protected static int right(int i)
    {
        return 2*(i+1);
    }
    
    /**
     *
     * @param leaf
     */
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
    public E getFirst() 
    {
        return data.get(0);
    }

    @Override
    public E remove() 
    {
        E minVal = getFirst();
        data.set(0, data.get(data.size()-1));
        data.setSize(data.size()-1);
        if(data.size() > 1) pushDownRoot(0);
        return minVal;
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

    /**
     *
     */
    @Override
    public void clear() 
    {
        data.clear();
    }
    
    /**
     *
     * @param root
     */
    public void pushDownRoot(int root)
    {
        int heapSize = data.size();
        E value = data.get(root);
        while(root < heapSize)
        {
            int childpos = left(root);
            if(childpos < heapSize)
            {
                if((right(root) < heapSize) && ((data.get(childpos + 1)).compareTo(data.get(childpos)) < 0)) childpos++;
                if((data.get(childpos)).compareTo(value) < 0)
                {
                    data.set(root, data.get(childpos));
                    root = childpos;
                } else
                {
                    data.set(root, value);
                    return;
                }
            } else
            {
                data.set(root, value);
                return;
            }
        }
    }
}
