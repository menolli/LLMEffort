public class ReportService {

    private final ReportFormatter formatter;

    public ReportService(ReportFormatter formatter) {
        this.formatter = formatter;
    }

    public void generate(ReportData data) {
        formatter.write(data);
    }
}