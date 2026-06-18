public class OrderItem {
    private final String product;
    private final double price;
    private final int quantity;

    public OrderItem(String product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }
}