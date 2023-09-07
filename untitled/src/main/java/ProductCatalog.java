import UserException.*;

public class ProductCatalog { //Товар берется из базы данных
    public static Product getProduct(int idProduct) throws ProductNotFound {
        try {
            if (idProduct == 1) {
                return new Product("Product test", 1, 500);
            } else if (idProduct != 1) {
                throw new ProductNotFound("Товар не найден.");
            }
        }
        catch (ProductNotFound exception){
            System.out.println(exception.getMessage());
        }
        return null;
    }


}

