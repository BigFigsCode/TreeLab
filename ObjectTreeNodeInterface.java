
/**
 * <h2>ObjectTreeNodeInterface.java - Used for the Binary tree and Hashing lab and as an interface for the ObjectTreeNode class.</h2> 
 * 
 * @author Brandon Figueroa
 * Palomar ID 010881556
 */
public interface ObjectTreeNodeInterface
{
    /**
     * method setInfo() sets a new object
     * @param o is the new object being set
     */
    public void setInfo(Object o);
    
    /**
     * method getInfo() returns the info of an object
     * @return info is the information being returned
     */
    public Object getInfo();
    
    /**
     * method setleft() sets a new tree node
     * @param o is the new object being set to the node
     */
    public void setLeft(ObjectTreeNode p);
    
    /**
     * method getLeft() gets the information on the left tree node
     * @return left is the node being returned
     */
    public ObjectTreeNode getLeft();
    
    /**
     * method setRight() sets a new tree node
     * @param p is the new node being set
     */
    public void setRight(ObjectTreeNode p);
    
    /**
     * method getRight() returns the right node of the tree
     * @return right is the node being returned
     */
    public ObjectTreeNode getRight();
}
