package ExceptionHandling;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String note){
        super(note);
    }
}
