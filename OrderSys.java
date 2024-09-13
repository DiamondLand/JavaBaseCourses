import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class Customer {
    String name;
    List<Order> orderHistory = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
        System.out.println(name + " placed an order.");
    }
}

class Order {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to order.");
    }

    public double getTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}

