public class Main {

    public static void main(String[] args) {

        Order order = new Order(10.0, 120.0, false);
        ShippingService service = new ShippingService();

        double costExpress = service.calculate(order, "EXPRESS");
        System.out.println("Express Shipping cost: $" + costExpress);

        double costSameDay = service.calculate(order, "SAME_DAY");
        System.out.println("Same Day Shipping cost: $" + costSameDay);
    }
}
