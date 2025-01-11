/**
 * <h2>ObjectListNodeInterface.java - An ObjectListNode class for the Binary Tree and Hashin Lab that implements
 *                                    an ObjectListNodeInterface.</h2> 
 * 
 * @author Brandon Figueroa
 * Palomar ID 010881556
 */
public class ObjectListNode implements ObjectListNodeInterface {
    private Object info;
    private ObjectListNode next;

    /**
     * Default constructor 
     */      
    public ObjectListNode() {
        info = null;
        next = null;
    }

    /**
     * One-arg constructor
     * @param o is the object being passed into the OnjectListNode
     */
    public ObjectListNode (Object o) {
        info = o;
        next = null;
    }    

    /**
     * Two-arg constructor
     * @param o is the object being passed
     * @param p is the node being passed
     */
    public ObjectListNode (Object o, ObjectListNode p) {
        info = o;
        next = p;
    }       

    /**
     * Sets info field
     * @param o is the new object being set
     */
    public void setInfo(Object o) {
        info = o;
    }    

    /**
     * Returns object in info field
     * @return info returns the objects in the info field of the list
     */
    public Object getInfo() {
        return info;
    }

    /**
     * Sets next field
     * @param p is the node being set
     */
    public void setNext(ObjectListNode p) {
        next = p;
    }

    /**
     * Returns object in info field
     * @return next is the node being returned
     */
    public ObjectListNode getNext() {
        return next;
    }
}
