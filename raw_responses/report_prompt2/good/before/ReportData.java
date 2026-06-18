import java.util.List;

public class ReportData {

    private final List<Double> values;

    public ReportData(List<Double> values) {
        this.values = values;
    }

    public List<Double> getValues() {
        return values;
    }

    public double getTotal() {
        return values.stream().mapToDouble(Double::doubleValue).sum();
    }
}