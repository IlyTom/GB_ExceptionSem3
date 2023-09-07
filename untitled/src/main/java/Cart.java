import UserException.ProductNotFound;
import UserException.QuantityNegativeValue;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private HashMap<Product,Integer> products = new HashMap<Product,Integer>();
    public void AddToCart(Product product, int quantity) throws QuantityNegativeValue { //Добавление в корзину
        try{
            if (product.getQuantity()<quantity) throw new QuantityNegativeValue("Недостаточно товара!");
            else products.put(product, quantity);}
        catch (QuantityNegativeValue exception){
            System.out.println(exception.getMessage());
        }
    }
    public void RemoveFromCart(Product product) throws ProductNotFound { //Удаление с корзины
        try{
            if (products.containsKey(product)){
                products.remove(product);
            }
            else throw new ProductNotFound("Товар не найден в корзине!");
        }
        catch (ProductNotFound exception){
            System.out.println(exception.getMessage());
        }

    }
    public int getQuantity(Product product){ //Получаем количество товара в корзине
        return products.get(product);
    }
    public int setQuantity(Product product, int quantity) throws QuantityNegativeValue{ //Меняем количество товара в корзине
        try{
            if (quantity>product.getQuantity()) throw new QuantityNegativeValue("Недостаточно товара на складе!");
            else if (quantity<0) throw new QuantityNegativeValue("Отрицательное значение товара!");
            else return products.replace(product, quantity);
        }
        catch (QuantityNegativeValue exception){
            System.out.println(exception.getMessage());
        }
        return products.get(product);
    }
    public HashMap<Product,Integer> getCart(){
        return products;
    }

    public void showCart() {
        for (Map.Entry<Product,Integer> entry : products.entrySet()){
            System.out.println(entry.getKey().getName()+"  "+entry.getValue());
        }
    }
}
