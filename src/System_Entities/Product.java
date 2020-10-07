package System_Entities;

public class Product {

    private String name;
    private double price;
    private double quantity;

    public Product() {

    }

    public Product(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }
    public double totalValue(){
        return price*quantity;
    }

    @Override
    public String toString() {
        return "Name: "+name+
                "  || Price: "+price+
                "  || Quantity: "+quantity+"\n";
    }
}
