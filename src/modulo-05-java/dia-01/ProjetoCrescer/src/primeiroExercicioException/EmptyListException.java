package primeiroExercicioException;


public class EmptyListException extends Exception {

    public EmptyListException(String msg) {
        super(msg);
    }
    
    public EmptyListException(){
    	super();
    }
}
