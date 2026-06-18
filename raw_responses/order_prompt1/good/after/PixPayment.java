public class PixPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pagando R$ " + amount + " com PIX.");
    }
}