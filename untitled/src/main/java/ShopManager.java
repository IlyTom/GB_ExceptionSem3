import java.util.Map;
import UserException.*;

public class ShopManager {
    public static double PurchaseProduct(int idProduct, int quantity) throws  ProductNotFound {  //Если покупаем один товар
        try {
            Product product = ProductCatalog.getProduct(idProduct);
            if (product == null) throw new ProductNotFound("Товар не найден");
            else {
                double totalPrice = product.getPrice() * quantity;
                return totalPrice;
            }
        } catch (ProductNotFound exception) {

        }
        return 0;

    }


    public static double PurchaseProductFromCart(Cart cart){ //Покупаем несколько товаров из корзины
        try {
            double totalPrice = 0;
            for (Map.Entry<Product, Integer> product : cart.getCart().entrySet()) {
                totalPrice += product.getValue() * product.getKey().getPrice();
            }



            return totalPrice;
        }
        catch (Exception e) {
            return 0;
        }
    }


}
