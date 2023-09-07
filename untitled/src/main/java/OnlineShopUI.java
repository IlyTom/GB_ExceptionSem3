import java.util.ArrayList;
import java.util.Scanner;
import UserException.*;


public class OnlineShopUI {
    public static void main(String[] args) throws ProductNotCreated, QuantityNegativeValue, ProductNotFound {
//        Создайте иерархию классов для интернет-магазина, как в примере .
//        Реализуйте методы для обработки покупок и доступа к данным о продуктах.
//        Добавьте исключения на каждый уровень абстракции для обработки возможных ошибок, например, если товар не найден.****
////        Дополнительно, вы можете добавить дополнительные уровни абстракции, такие как уровень оплаты и доставки, и реализовать обработку исключений и на этих уровнях.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter product ID: ");
//        int productId = scanner.nextInt();
//        System.out.print("Enter quantity: ");
//        int quantity = scanner.nextInt();
//
//        double totalPrice = ShopManager.PurchaseProduct(productId, quantity);
//        System.out.println("Total price: $" + totalPrice);
        System.out.println("=".repeat(100));




        Product Apple = new Product("Apple",20,50);
        Product Orange = new Product("Orange",89,65);
        Product Tomato = new Product("Tomato",15,39);
        Product Milk = new Product("Milk", 30,85);



        Cart cart = new Cart();
        cart.AddToCart(Apple, 5);
        cart.showCart();
        cart.RemoveFromCart(Orange);
        cart.AddToCart(Tomato,19);
        cart.AddToCart(Milk,25);
        System.out.println("=".repeat(100));
        cart.showCart();

        System.out.println("=".repeat(100));
        cart.setQuantity(Apple,21);
        cart.showCart();
        cart.setQuantity(Apple,6);
        cart.setQuantity(Milk,15);
        cart.showCart();
        System.out.println("=".repeat(100));

        System.out.println("Total price: $"+ ShopManager.PurchaseProductFromCart(cart));









        
    }
}
