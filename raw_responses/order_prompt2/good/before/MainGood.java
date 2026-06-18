import java.util.List;

public class MainGood {

    public static void main(String[] args) {

        OrderItem item1 = new OrderItem("Livro", 50.0, 2);
        OrderItem item2 = new OrderItem("Caneta", 5.0, 3);

        Order order = new Order(List.of(item1, item2));

        PaymentMethod paymentMethod = new CreditCardPayment();
        OrderService orderService = new OrderService(paymentMethod);

        orderService.processOrder(order);
    }
}
