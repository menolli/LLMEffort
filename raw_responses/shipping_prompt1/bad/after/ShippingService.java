public class ShippingService {

    private final StandardShippingCalculator standardCalculator;
    private final ExpressShippingCalculator expressCalculator;
    private final SameDayShippingCalculator sameDayCalculator;

    public ShippingService() {
        this.standardCalculator = new StandardShippingCalculator();
        this.expressCalculator = new ExpressShippingCalculator();
        this.sameDayCalculator = new SameDayShippingCalculator();
    }

    public double calculate(Order order, String deliveryType) {

        if ("STANDARD".equalsIgnoreCase(deliveryType)) {
            return standardCalculator.calculate(order);
        }

        if ("EXPRESS".equalsIgnoreCase(deliveryType)) {
            return expressCalculator.calculate(order);
        }

        if ("SAME_DAY".equalsIgnoreCase(deliveryType)) {
            return sameDayCalculator.calculate(order);
        }

        throw new IllegalArgumentException("Unsupported delivery type");
    }
}
