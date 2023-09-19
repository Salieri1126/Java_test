package src.ppt4;

public class UserQuitException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5305992935672654968L;

	public UserQuitException() {}
	
	public UserQuitException(String s) {
		System.out.println(s);
	}
}
