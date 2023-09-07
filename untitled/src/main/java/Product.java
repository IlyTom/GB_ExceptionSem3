import UserException.*;
public class  Product {
    private String name;
    private int idProduct;
    private int quantity;
    private int price;
    public Product(String name, int quantity, int price) {
        try {

            if ((name == null) || (price == 0)) {
                throw new ProductNotCreated("Продукт не создан. Ошибка введения данных");
            }
            else {
                this.name = name;
                this.quantity = quantity;
                this.price = price;
            }
        }
        catch (ProductNotCreated exception){
            System.out.println(exception.getMessage());
        }
    }
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) throws QuantityNegativeValue {
        try {
            if (quantity<0) throw new QuantityNegativeValue("Отрицательное значение кол-ва товара!");
            else this.quantity = quantity;
        }
        catch (QuantityNegativeValue e){
            System.out.println(e.getMessage());
        }
    }

    public void setPrice(int price) throws PriceNegativeValue {

        try {
            if (price>0) this.price = price;
            else throw new PriceNegativeValue("Отрицательная величена цены товара!");
        }
        catch (PriceNegativeValue exception){
            System.out.println(exception.getMessage());
        }
    }
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

}
