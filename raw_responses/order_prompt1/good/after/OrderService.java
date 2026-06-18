public class OrderService {
    private final PaymentMethod paymentMethod;

    public OrderService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processOrder(Order order) {
        double total = order.calculateTotal();
        paymentMethod.pay(total);
        System.out.println("Pedido processado com sucesso.");
    }
}