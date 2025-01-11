import java.io.*;
import java.util.Scanner;
/**
 * <h2>Query.java - Query class is used to search for a word that the user inputs by traversing the binary tree in an inorder form.</h2> 
 * 
 * @author Brandon Figueroa
 * Palomar ID 010881556
 */
public class Query {
    private PrintWriter pw;
    private Xref crossRef;
    private String query;

    /**
     * Query constructor
     * @param pw output file
     * @param x cross reference table and statistics
     */
    public Query (PrintWriter pw, Xref x){
        this.pw = pw;
        this.crossRef = x;
        this.query = null;
    }

    /**
     * Method search() will take user input and search for specific words from the user.
     */
    public void search() {
        boolean x = true;
        ObjectBinaryTree BST = crossRef.getTree();
        Scanner input = new Scanner(System.in);

        while (x) {
            System.out.println();
            pw.println();

            System.out.println("Enter word to query (0 to stop): ");
            pw.println("Enter word to query (0 to stop): ");

            query = input.nextLine();
            pw.print("User input: " + query + "\r\n");
            Word searchFor = new Word(query.toLowerCase());
            ObjectTreeNode q = BST.searchBST(searchFor);

            if (query.equals("0")) {
                System.out.println("User query stopped.");
                pw.println("User query stopped.");
                x = false;
                input.close();
            }
            else if (q == null) {
                System.out.println("Error: '" + query +"' not found.");
                pw.println("Error: '" + query +"' not found.");
            }
            else {
                System.out.printf("%-9s %-12s %-10s\n", "Word", "Appearances", "Line-Position");
                pw.printf("%-9s %-12s %-10s\r\n", "Word", "Appearances", "Line-Position");

                System.out.println("----------------------------------------------------------------------------------------------------");
                pw.println("----------------------------------------------------------------------------------------------------");

                Word w = (Word) q.getInfo();
                w.visit();
            }

        }

    }

}
