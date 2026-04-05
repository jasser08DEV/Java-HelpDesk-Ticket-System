/**
 * The Printable interface defines a contract for objects that can be
 * converted into a formatted string representation suitable for file output.
 * 
 * Any class implementing this interface must provide an implementation
 * of the getFileData() method.
 * 
 * @author Jasser Hammami
 * @version 1.0
 * @since 2025-04-20
 */
public interface Printable {

    /**
     * Returns a string formatted for file output.
     *
     * @return A string representing the object’s data in file-ready format.
     */
    String getFileData();
}
