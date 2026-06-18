public class Order {

    private final double weightKg;
    private final double distanceKm;
    private final boolean international;

    public Order(double weightKg, double distanceKm, boolean international) {
        this.weightKg = weightKg;
        this.distanceKm = distanceKm;
        this.international = international;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public boolean isInternational() {
        return international;
    }
}