
/**
 * <h2>ObjectListInterface.java - An ObjectListInterface class for the ObjectList class.</h2> 
 * 
 * @author Brandon Figueroa
 * Palomar ID 010881556
 */
public interface ObjectListInterface
{
    /**
     * Returns the first object in the list
     * @return list.getInfo() returns the first object on the list
     */
    public Object getFirst();

    /**
     * Returns the last object in the list
     * @return last.getInfo() returns the last object of the list
     */
    public Object getLast();

    /**
     * Adds an object to the front of a list
     * @param o is the object being added to the front of the list
     */
    public void addFirst(Object o);

    /**
     * Adds a node to the front of the list
     * @param p is the node being added to the front of the list
     */
    public void addFirst(ObjectListNode p);

    /**
     * Adds an object to the end of the list
     * @param o is the object being added to the end of the list
     */
    public void addLast(Object o);

    /**
     * Adds a node to the end of the list
     * @param p is the node being added to the end of the list
     * 
     */
    public void addLast(ObjectListNode p);

    /**
     * Removes the first object from the list
     * @return p.getInfo() is the first object being removed
     */
    public Object removeFirst();

    /**
     * Removes the last object from the list
     * @return p.getInfo() is the last object in the list being removed
     */
    public Object removeLast();

    /**
     * Inserts an object after the node referenced by p
     * @param p is the node being referenced
     * @param o is the object being inserted after the reference of p
     */
    public void insertAfter (ObjectListNode p, Object o);

    /**
     * Inserts a node after the node referenced by p
     * @param p is the node being referenced
     * @param q is the node being inserted after p
     */
    public void insertAfter(ObjectListNode p, ObjectListNode q);

    /**
     * Deletes the node after the node referenced by p
     * @param p is the node being deleted
     * @return is the next node after being deleted
     */
    public Object deleteAfter(ObjectListNode p);

    /**
     * Inserts an item into its correct location within an ordered list
     * @param o is the object being inserted
     */
    public void insert(Object o);

    /**
     * Inserts a node into its correct location within an ordered list
     * @param r is the object node being insterted
     */
    public void insert(ObjectListNode r);

    /**
     * Removes the first occurrence of an item in a list 
     * @param o is the object to remove
     * @return if q == null then remove the first node else deleted after q
     */
    public Object remove(Object o);

    /**
     * Returns true if the item is found in the list
     * @param o is the object being found
     * @return p!=null
     */
    public boolean contains(Object o);

    /**
     * Returns a reference to the node with the requested value
     * Returns null otherwise
     * @param object is the node being selected
     * @return null
     */
    public ObjectListNode select(Object o);

    /**
     * Determines whether or not a list is empty
     */
    public boolean isEmpty();

    /**
     * Removes all elements from a list
     */
    public void clear();

    /**
     * Returns the number of elements in the list
     * @return count is the count of all elements in the list
     */
    public int size();

    /**
     * Makes a copy of a list
     * @return newList is the copy of the list
     */
    public ObjectList copyList();

    /**
     * Reverses a list
     */
    public void reverse();
}
