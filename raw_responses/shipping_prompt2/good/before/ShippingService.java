public class ShippingService {

    private final ShippingCalculator calculator;

    public ShippingService(ShippingCalculator calculator) {
        this.calculator = calculator;
    }

    public double calculate(Order order) {
        return calculator.calculate(order);
    }
}