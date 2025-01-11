
/**
 * <h2>ObjectBinaryTreeInterface.java - Used for the Binary tree and Hashing lab.</h2> 
 * 
 * @author Brandon Figueroa
 * Palomar ID 010881556
 */
public interface ObjectBinaryTreeInterface
{
    /**
     * method setLeftChild() sets a left node of that parent
     * @param parent is the parent of the left node
     * @param r is the node of the parent
     */
    public void setLeftChild(ObjectTreeNode parent, ObjectTreeNode r);
    
    /**
     * method setRightChild() sets a right node of that parent
     * @param parent is the parent of the right node
     * @param r is the node of the parent
     */
    public void setRightChild(ObjectTreeNode parent, ObjectTreeNode r);
    
    /**
     * method insertBST() inserts an object into the binary search tree
     * @param o is the object being passed
     */ 
    public void insertBST(Object o);
    
    /**
     * method insertBSTDUPO() inserts an object into a duplicate BST
     * @param o is the object being passed
     */
    public void insertBSTDup(Object o);
    
    /**
     * method searchBST() will search for a specific object in the BST
     * @param o is the object being searched for
     */
    public ObjectTreeNode searchBST(Object o);
    
    /**
     * method preTrav() will go through the tree in preorder
     * @param tree is the tree being searched through in preorder
     */
    public void preTrav(ObjectTreeNode tree);
    
    /**
     * method inTrav() will go through the tree in inorder 
     * @param tree is the tree being searched through
     */
    public void inTrav(ObjectTreeNode tree);

    /**
     * method postTrav() will go through the tree in a postorder
     * @param tree is the tree being searched for
     */
    public void postTrav(ObjectTreeNode tree);
    
    /**
     * method delete() deletes and object from the tree
     * @param o is the object being deleted
     */
    public void delete(Object o);
}
