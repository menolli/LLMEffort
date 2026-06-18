public class ExpressShippingCalculator {

    public double calculate(Order order) {
        double base = order.getWeightKg() * 2.0
                    + order.getDistanceKm() * 0.08;

        if (order.isInternational()) {
            base += 40.0;
        }

        return base;
    }
}