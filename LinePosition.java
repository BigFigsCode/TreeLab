import java.io.*;
/**
 * <h2>LinePosition.java - LinePosition class is used to get the line position of the word and the line number as well.</h2> 
 * 
 * @author Brandon Figueroa
 * Palomar ID 010881556
 */
public class LinePosition
{
    private int lineNumber;
    private int position;

    /**
     * Line position class is linked list for getting the line and position of words.
     * @param line
     * @param position
     */
    public LinePosition(int line, int position) {
        this.lineNumber = line;
        this.position = position;
    }
    
    /**
     * method getlineNumber() returns the line number
     * @return lineNumber is the lineNumber being returned
     */
    public int getLineNumber() {
        return lineNumber;
    }
    
    /**
     * method getPosition() returns the position of the word
     * @return position is the position being returned
     */
    public int getPosition() {
        return position;
    }
}
