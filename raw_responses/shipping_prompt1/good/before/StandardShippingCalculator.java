public class StandardShippingCalculator implements ShippingCalculator {

    @Override
    public double calculate(Order order) {
        double base = order.getWeightKg() * 1.2
                    + order.getDistanceKm() * 0.05;

        if (order.isInternational()) {
            base += 25.0;
        }

        return base;
    }
}