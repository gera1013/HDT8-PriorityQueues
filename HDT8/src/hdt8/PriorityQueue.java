//package hdt8;

/**
 *
 * @author Gerardo
 * @param <E>
 */
public interface PriorityQueue<E extends Comparable<E>> 
{

    /**
     * @return el primer elemento dentro del queue
     */
    public E getFirst();
    // pre: !isEmpty()
    // post: returns the minimum value in priority queue

    /**
     * @return elimina y devuelve el primer elemento del queue
     */
    public E remove();
    // pre: !isEmpty()
    // post: returns and removes minimum value from queue
    
    /**
     * @param value elemento a ser agregado
     */
    public void add(E value);
    // pre: value is non-null comparable
    // post: value is added to priority queue
    
    /**
     * @return true if queue está vacío, false si no lo está
     */
    public boolean isEmpty();
    // post: returns true iff no elements are in queue 
    
    /**
     * @return tamaño del queue
     */
    public int size();
    // post: returns number of elements within queue
    
    public void clear();
    // post: removes all elements from queue
    
}
