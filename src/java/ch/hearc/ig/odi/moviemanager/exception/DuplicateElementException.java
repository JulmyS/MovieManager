package ch.hearc.ig.odi.moviemanager.exception;

/**
 *
 * @author JulmyS
 */
public class DuplicateElementException extends Exception{
    public DuplicateElementException() {
            super();
	}

	/**
	 * 
	 * @param message
	 */
	public DuplicateElementException(String message) {
            super(message);
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public DuplicateElementException(String message, Throwable cause) {
            super(message, cause);
	}
    
}