public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pagando R$ " + amount + " com cartão de crédito.");
    }
}
