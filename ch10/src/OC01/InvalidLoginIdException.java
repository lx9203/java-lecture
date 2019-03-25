package OC01;

public class InvalidLoginIdException extends Exception {
	public InvalidLoginIdException() {}
	public InvalidLoginIdException(String message) {
		super(message);
	}
}
