public class SameDayShippingCalculator {

    public double calculate(Order order) {
        double base = order.getWeightKg() * 3.0
                    + order.getDistanceKm() * 0.12;

        if (order.isInternational()) {
            base += 50.0;
        }

        return base;
    }
}
