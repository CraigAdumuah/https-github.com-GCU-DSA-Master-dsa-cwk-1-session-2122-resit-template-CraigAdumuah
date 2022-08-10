package daos;

import model.lettersASCII;

/**
 * An abstract Data Access Object class
 * which specifies the functionality required
 * to interact with a data store and implemented
 * in concrete subclasses
 */
public abstract class DAO {

    public abstract void loadFromFile(String filename);
    public abstract void writeToFile(String filename);
    public abstract void add(lettersASCII aLetter);
    public abstract lettersASCII retrieve(String aLetter);
    public abstract lettersASCII remove(int pos);

}