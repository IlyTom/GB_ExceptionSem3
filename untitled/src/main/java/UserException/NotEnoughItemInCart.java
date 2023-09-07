package UserException;

public class NotEnoughItemInCart extends Exception{
    public NotEnoughItemInCart(String message){
        super(message);
    }
}
