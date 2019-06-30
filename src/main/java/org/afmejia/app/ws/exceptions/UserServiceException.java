package org.afmejia.app.ws.exceptions;

/**
 * UserServiceException
 */
public class UserServiceException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -580675252861461742L;

	public UserServiceException(String message) {
        super(message);
    }
}