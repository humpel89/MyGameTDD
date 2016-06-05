package exceptions;


public class InvalidItemTypeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidItemTypeException(String message) {
		super(message);
	}
}
