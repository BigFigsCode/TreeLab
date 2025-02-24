/**
 * <h2>ObjectBinaryTree.java - Used for the Binary tree and Hashing lab and implements the ObjectBinaryTreeInterface.</h2> 
 * 
 * @author Brandon Figueroa
 * Palomar ID 010881556
 */

public class ObjectBinaryTree implements ObjectBinaryTreeInterface{
    private ObjectTreeNode root;
    /**
     * No args constructor
     */
    public ObjectBinaryTree() {
        root = null;
    }
    
    /**
     * method getRoot() gets the root of the tree
     * @return root returns the object at the root of the tree
     */
    public ObjectTreeNode getRoot() {
        return root;
    }
    
    /**
     * method setLeftChild() sets a left node of that parent
     * @param parent is the parent of the left node
     * @param r is the node of the parent
     */
    public void setLeftChild(ObjectTreeNode parent, ObjectTreeNode r) {
        if (parent == null || parent.getLeft() != null) {
            System.out.println("Runtime Error: setLeftChild()");
            System.exit(1);
        }
        parent.setLeft(r);
    }
    
    /**
     * method setRightChild() sets a right node of that parent
     * @param parent is the parent of the right node
     * @param r is the node of the parent
     */
    public void setRightChild(ObjectTreeNode parent, ObjectTreeNode r){
        if (parent == null || parent.getRight() != null) {
            System.out.println("Runtime Error: setRightChild()");
            System.exit(1);
        }
        parent.setRight(r);
    }
   
    /**
     * method insertBST() inserts an object into the binary search tree
     * @param o is the object being passed
     */ 
    public void insertBST(Object o) {
        ObjectTreeNode p, q;
                
        ObjectTreeNode r = new ObjectTreeNode(o);
        if (root == null)
            root = r;
        else {
            p = root;
            q = root;
            while (q != null) {
                p = q;
                if (((TreeComparable)(r.getInfo())).compareTo(p.getInfo()) < 0 )
                    q = p.getLeft();
                else
                    q = p.getRight();
            }
            if (((TreeComparable)(r.getInfo())).compareTo(p.getInfo()) < 0)
                setLeftChild(p, r);
            else
                setRightChild(p, r);
        }
    }
    
    /**
     * method insertBSTDUPO() inserts an object into a duplicate BST
     * @param o is the object being passed
     */
    public void insertBSTDup(Object o) {
        ObjectTreeNode p, q;
                
        ObjectTreeNode r = new ObjectTreeNode(o);
        if (root == null)
            root = r;
        else {
            p = root;
            q = root;
            while (q != null && ((TreeComparable)(r.getInfo())).compareTo(p.getInfo()) != 0) {
                p = q;
                if (((TreeComparable)(r.getInfo())).compareTo(p.getInfo()) < 0)
                    q = p.getLeft();
                else
                    q = p.getRight();
            }
            if (((TreeComparable)(r.getInfo())).compareTo(p.getInfo()) < 0)
                setLeftChild(p, r);
            else if (((TreeComparable)(r.getInfo())).compareTo(p.getInfo()) > 0)
                setRightChild(p, r);
            else ((TreeComparable)(p.getInfo())).operate(r.getInfo());
        }
    }
    
    /**
     * method searchBST() will search for a specific object in the BST
     * @param o is the object being searched for
     */
    public ObjectTreeNode searchBST(Object o) {
        ObjectTreeNode p;
                
        ObjectTreeNode r = new ObjectTreeNode(o);
        if(root != null) {
            p = root;
            while (p != null) {
                if (((TreeComparable)(r.getInfo())).compareTo(p.getInfo()) < 0)
                    p = p.getLeft();
                else if (((TreeComparable)(r.getInfo())).compareTo(p.getInfo()) > 0)
                    p = p.getRight();
                else 
                    return p;
            }
        }
        return null;
    }
    
    /**
     * method preTrav() will go through the tree in preorder
     * @param tree is the tree being searched through in preorder
     */
    public void preTrav(ObjectTreeNode tree) {
        if (tree != null) {
            ((TreeComparable)tree.getInfo()).visit();
            preTrav(tree.getLeft());
            preTrav(tree.getRight());
        }
    }
    
    /**
     * method inTrav() will go through the tree in inorder 
     * @param tree is the tree being searched through
     */
    public void inTrav(ObjectTreeNode tree) {
        if (tree != null) {
            inTrav(tree.getLeft());
            ((TreeComparable)tree.getInfo()).visit();
            inTrav(tree.getRight());
        }
    }
    
    /**
     * method postTrav() will go through the tree in a postorder
     * @param tree is the tree being searched for
     */
    public void postTrav(ObjectTreeNode tree) {
        if (tree != null) {
            postTrav(tree.getLeft());
            postTrav(tree.getRight());
            ((TreeComparable)tree.getInfo()).visit();
        }
    }
   
    /**
     * method delete() deletes and object from the tree
     * @param o is the object being deleted
     */
    public void delete(Object o) {
        ObjectTreeNode s, t, v;
        boolean found = false;
                
        ObjectTreeNode r = new ObjectTreeNode(o);
        ObjectTreeNode p = root;
        ObjectTreeNode q = null;
        // Search for the node with info key, set p to point to 
        //that node and set q to point to its parent, if any.
        while (p != null && !found) {
            if (((TreeComparable)(r.getInfo())).compareTo((TreeComparable)(p.getInfo())) == 0)
                found = true;
            else {
                q = p;
                if (((TreeComparable)(r.getInfo())).compareTo((TreeComparable)(p.getInfo())) < 0)
                    p = p.getLeft();
                else
                    p = p.getRight();
            }
        }
        if (found) {
            // Set v to point to the node that will replace the node 
            // that p points to.
            if (p.getLeft() == null)
                v = p.getRight();
            else if (p.getRight() == null)
                v = p.getLeft();
            else {
                // the node that p points to has two children;
                // set v to the inorder successor of p;
                // set t to the parent of v
                t = p;
                v = p.getRight();
                s = v.getLeft();  // s is the left child of v
                while (s != null) {
                    t = v;
                    v = s;
                    s = v.getLeft();
                }
                // At this point, v is the inorder successor of p
                if (t != p) {
                    // p is not the parent of v and v = t.getLeft()
                    t.setLeft(v.getRight());
                    // Remove the node that v points to from its
                    // current position to take the place of the 
                    // node that p points to.
                    v.setRight(p.getRight());
                }
                v.setLeft(p.getLeft());
            }
            // Insert the node that v points to into the position
            // formally occupied by the node that p points to
            if (q == null)
                // The node that p points to was the root of the tree
                root = v;
            else if (p == q.getLeft())
                q.setLeft(v);
            else q.setRight(v);
        }
    }
}
