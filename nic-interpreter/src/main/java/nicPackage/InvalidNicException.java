
package nicPackage;

public class InvalidNicException extends Exception {
    
    public InvalidNicException() {
		super("Please enter a valid NIC number");
	}
    
}
