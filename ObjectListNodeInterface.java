
/**
 * <h2>ObjectListNodeInterface.java - An ObjectListNodeInterface class for the Binary Tree and Hashing Lab and ObjectListNode class.</h2> 
 * 
 * @author Brandon Figueroa
 * Palomar ID 010881556
 */
public interface ObjectListNodeInterface
{
    /**
     * Sets info field
     * @param o is the new object being set
     */
    public void setInfo(Object o);

    /**
     * Returns object in info field
     * @return info returns the objects in the info field of the list
     */
    public Object getInfo();

    /**
     * Sets next field
     * @param p is the node being set
     */
    public void setNext(ObjectListNode p);

    /**
     * Returns object in info field
     * @return next is the node being returned
     */
    public ObjectListNode getNext();
}
