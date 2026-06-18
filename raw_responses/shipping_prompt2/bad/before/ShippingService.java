public class ShippingService {

    private final StandardShippingCalculator standardCalculator;
    private final ExpressShippingCalculator expressCalculator;

    public ShippingService() {
        this.standardCalculator = new StandardShippingCalculator();
        this.expressCalculator = new ExpressShippingCalculator();
    }

    public double calculate(Order order, String deliveryType) {

        if ("STANDARD".equalsIgnoreCase(deliveryType)) {
            return standardCalculator.calculate(order);
        }

        if ("EXPRESS".equalsIgnoreCase(deliveryType)) {
            return expressCalculator.calculate(order);
        }

        throw new IllegalArgumentException("Unsupported delivery type");
    }
}