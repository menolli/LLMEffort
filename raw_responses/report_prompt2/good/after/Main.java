import java.util.List;

public class Main {

    public static void main(String[] args) {
        ReportData data = new ReportData(List.of(10.0, 20.5, 30.0));
        
        // CSV Report
        ReportFormatter csvFormatter = new CsvReportFormatter();
        ReportService csvService = new ReportService(csvFormatter);
        csvService.generate(data);
        
        // PDF Report
        ReportFormatter pdfFormatter = new PdfReportFormatter();
        ReportService pdfService = new ReportService(pdfFormatter);
        pdfService.generate(data);
        
        // JSON Report
        ReportFormatter jsonFormatter = new JsonReportFormatter();
        ReportService jsonService = new ReportService(jsonFormatter);
        jsonService.generate(data);
    }
}