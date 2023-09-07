package UserException;

public class PriceNegativeValue extends Exception {
    public PriceNegativeValue(String message){
        super(message);
    }
}
