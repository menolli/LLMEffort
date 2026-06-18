import java.util.List;

public class Main {

    public static void main(String[] args) {
        ReportData data = new ReportData(List.of(10.0, 20.5, 30.0));
        ReportFormatter formatter = new CsvReportFormatter();
        ReportService service = new ReportService(formatter);
        service.generate(data);
    }
}