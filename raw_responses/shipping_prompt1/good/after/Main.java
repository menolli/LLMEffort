public class Main {

    public static void main(String[] args) {

        Order order = new Order(10.0, 120.0, false);
        ShippingCalculator calculator = new ExpressShippingCalculator();
        ShippingService service = new ShippingService(calculator);

        double cost = service.calculate(order);

        System.out.println("Shipping cost: $" + cost);
    }
}