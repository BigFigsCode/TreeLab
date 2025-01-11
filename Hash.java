import java.io.*;
import java.util.*;
/**
 * <h2>Hash.java - Hash class is used to input the omit.txt file, check for important and unimportant words, and it also implements a hash table and hash function
 *                 to create keys for each ommited word in the file. This class will use linear probing to handle collisions.</h2> 
 *
 * @author Brandon Figueroa
 * Palomar ID 010881556
 */
public class Hash
{
    private PrintWriter pw;
    private int TABLESIZE;
    private int index;
    private int resCollisions;
    private int hashCollisions;
    private int omitcount;
    private String[] hashTable;
    private int keys;
    /**
     * Hash constructor
     * @param pw output file
     */
    public Hash(PrintWriter pw) {
        this.pw = pw;
        TABLESIZE = 37;
        hashTable = new String[TABLESIZE];
        hashCollisions = 0;
        resCollisions = 0;
        omitcount = 0;
    }

    /**
     * Method getHash() is a private method that takes the sum of all characters in the file.
     * Then that sum is taken to the power of 6 and multiplied by 102 and lastly modded by the table size of 37
     *
     * @param key hash table key
     * @return index for storage
     */
    private int getHash(String key) {
        index = 0;
        int sum = 0;
        for (int i = 0; i < key.length(); i++) {
            sum += (int) key.charAt(i);
        }
        index = (sum^6 * 102) % TABLESIZE;//results in 1 collision
        return index;
    }

    /**
     * gets and inputs the omitted words
     * @throws IOException
     */
    public void getOmitted() throws IOException {
        Scanner omit = new Scanner(new File("omit.txt"));

        while (omit.hasNext()) {
            String omitted = omit.next();
            insert(getHash(omitted), omitted);

        }
    }

    /**
     * inserts the item into hash table
     * @param index index to be inserted
     * @param key word to be inserted
     */
    public void insert(int index, String key) {
        if (hashTable[index] == null) {
            hashTable[index] = key;
        } else {
            linearProbeInsert(index, key);
            keys++;
        }
    }

    /**
     * Method linearProbingInsert() is a linear probing insert algorithm
     * @param index index of the hashTable array
     * @param key word used to get hashed
     */
    private void linearProbeInsert(int index, String key) {

        if (hashTable[index] == null) {
            hashTable[index] = key;
        }else{
            hashCollisions++;

            while (hashTable[index] != null) {
                resCollisions++;
                index++;
                if (index >= TABLESIZE) {
                    index = 0;
                    //index++;
                }
            }
        }
    }

    /**
     * method search() searches for a word in hash table
     * @param key word used to get hashed
     * @return boolean if search hit or miss
     */
    public boolean search(String key) {
        index = getHash(key);
        boolean reset = false;

        if (hashTable[index] == null) {
            return false;
        }else if (hashTable[index].equals(key)) {
            omitcount++;
            return true;
        }else{
            linearProbeSearch(index, key, reset);
        }
        return false;
    }

    /**
     * method linearProbeSearch() is algorithm for linear probe searching
     * @param index index of hash table
     * @param key word used to get hashed
     * @param reset if probe wraps around back to beginnning
     * @return search hit or miss
     */
    private boolean linearProbeSearch(int index, String key, boolean reset) {
        while (hashTable[index] != null && !(hashTable[index].equals(key))) {

            index++;
            if (hashTable[index] != null  && hashTable[index].equals(key)) {
                omitcount++;
                return true;
            }
            if (index >= TABLESIZE) {
                index = 0;
                reset = true;
            }
            if (reset && index == index) {
                return false;
            }
        }
        return false;
    }

    /**
     * method outPutHash() displays the hashtable, collisions and load factor
     */
    public void outPutHash() {
        System.out.println("My hash function iterates through the omit list and counts all of the characters in the file.");
        System.out.println("Then I raise that sum to the power of 6 and miltiply it by 102 and mod it by the table size of 37.");
        this.pw.println("My hash function iterates through the omit list and counts all of the characters in the in the file.");
        this.pw.println("Then I raise that sum to the power of 6 and miltiply it by 102 and mod it by the table size of 37.");
        
        System.out.println("-------------------------");
        this.pw.println("-------------------------");

        System.out.println(" Hash Table");
        this.pw.println(" Hash Table");

        System.out.println("-------------------------");
        this.pw.println("-------------------------");

        System.out.println(" Code |  Key");
        this.pw.println(" Code |  Key");

        System.out.println("-------------------------");
        this.pw.println("-------------------------");
        for (int index = 0; index < TABLESIZE; index++) {
            if (hashTable[index] != null) {

                System.out.println(index + "\t|" + hashTable[index]);
                this.pw.println(index + "\t|" + hashTable[index]);
            }else if (hashTable[index] == null) {
                System.out.println(index + "\t|" + "-");
                this.pw.println(index + "\t|" + "-");
            }
        }

        System.out.println("------------------------------");
        this.pw.println("------------------------------");

        System.out.println("Hash Collisions: " + "\t" + hashCollisions);
        this.pw.println("Hash Collisions: " + "\t" + hashCollisions);

        System.out.println("Resolution Collisions: " + "\t" + resCollisions);
        this.pw.println("Resolution Collisions: " + "\t" + resCollisions);
        
        System.out.println("Total Collisions: " + "\t" + (hashCollisions + resCollisions));
        this.pw.println("Total Collisions: " + "\t" + (hashCollisions + resCollisions));
        
        System.out.printf("Load factor: %.2f percent\n", (double) keys / TABLESIZE * 100);
        this.pw.printf("Load factor: %.2f percent\r\n", (double) keys / TABLESIZE * 100);

        System.out.println("------------------------------\n");
        this.pw.println("------------------------------\r\n");

    }

}
