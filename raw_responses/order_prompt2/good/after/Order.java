import java.util.List;

public class Order {

    private final List<OrderItem> items;

    public Order(List<OrderItem> items) {
        this.items = items;
    }

    public double calculateTotal() {
        return items.stream()
                    .mapToDouble(item -> item.getTotal())
                    .sum();
    }
}
