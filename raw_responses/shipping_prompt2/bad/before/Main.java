public class Main {

    public static void main(String[] args) {

        Order order = new Order(10.0, 120.0, false);
        ShippingService service = new ShippingService();

        double cost = service.calculate(order, "EXPRESS");

        System.out.println("Shipping cost: $" + cost);
    }
}