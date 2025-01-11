
/**
 * <h2>TreeComparable.java - Used for the Binary tree and Hashing lab and as an interface for the the Word class.</h2> 
 * 
 * @author Brandon Figueroa
 * Palomar ID 010881556
 */
public interface TreeComparable
{
    /**
     * compareTo is for comparing words for search tree
     * @param o word
     * @return the greater word
     */
    int compareTo(Object o);
    
    /**
     * operate adds word to tree and adds to the counter
     * @param o word
     */
    void operate(Object o);
    
    /**
     * visit outputs the line-position of each word that is visited
     */
    void visit();
}
