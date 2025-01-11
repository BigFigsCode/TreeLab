/**
 * <h2>ObjectTreeNode.java - Used for the Binary tree and Hashing lab and implements the ObjectTreeNodeInterface.</h2> 
 * 
 * @author Brandon Figueroa
 * Palomar ID 010881556
 */

public class ObjectTreeNode implements ObjectTreeNodeInterface {
    private Object info;
    private ObjectTreeNode left;
    private ObjectTreeNode right;
    /**
     * No args constructor
     */
    public ObjectTreeNode() {
        info = null;
        left = null;
        right = null;
    }
    
    /**
     * Single arg constructor 
     * @param o is the object being passed when instantiating the ObjectTreeNode
     */
    public ObjectTreeNode (Object o) {
        info = o;
        left = null;
        right = null;
    }
    
    /**
     * method setInfo() sets a new object
     * @param o is the new object being set
     */
    public void setInfo(Object o) {
        info = o;
    }
    
    /**
     * method getInfo() returns the info of an object
     * @return info is the information being returned
     */
    public Object getInfo() {
        return info;
    }
    
    /**
     * method setleft() sets a new tree node
     * @param o is the new object being set to the node
     */
    public void setLeft(ObjectTreeNode p) {
        left = p;
    }
    
    /**
     * method getLeft() gets the information on the left tree node
     * @return left is the node being returned
     */
    public ObjectTreeNode getLeft() {
        return left;
    }
    
    /**
     * method setRight() sets a new tree node
     * @param p is the new node being set
     */
    public void setRight(ObjectTreeNode p) {
        right = p;
    }
    
    /**
     * method getRight() returns the right node of the tree
     * @return right is the node being returned
     */
    public ObjectTreeNode getRight() {
        return right;
    }
}
