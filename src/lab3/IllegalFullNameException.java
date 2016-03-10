/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Tim
 */
public class IllegalFullNameException extends IllegalArgumentException{
    
    private static final String ERRMSG = "Sorry full name must consist of first name and last name";
    public IllegalFullNameException() {
        super(ERRMSG);
    }

    public IllegalFullNameException(String s) {
        super(ERRMSG);
    }

    public IllegalFullNameException(String message, Throwable cause) {
        super(ERRMSG, cause);
    }

    public IllegalFullNameException(Throwable cause) {
        super(cause);
    }
    
}
