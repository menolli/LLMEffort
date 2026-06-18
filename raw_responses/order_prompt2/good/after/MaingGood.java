import java.util.List;

public class MaingoodUpdated {

    public static void main(String[] args) {

        OrderItem item1 = new OrderItem("Livro", 50.0, 2);
        OrderItem item2 = new OrderItem("Caneta", 5.0, 3);

        Order order = new Order(List.of(item1, item2));

        // Example using CreditCardPayment
        PaymentMethod creditCardPayment = new CreditCardPayment();
        OrderService orderServiceCreditCard = new OrderService(creditCardPayment);
        orderServiceCreditCard.processOrder(order);

        // Example using PixPayment
        PaymentMethod pixPayment = new PixPayment();
        OrderService orderServicePix = new OrderService(pixPayment);
        orderServicePix.processOrder(order);
    }
}