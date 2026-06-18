public class ReportService {

    private final CsvReportWriter csvWriter;
    private final PdfReportWriter pdfWriter;

    public ReportService() {
        this.csvWriter = new CsvReportWriter();
        this.pdfWriter = new PdfReportWriter();
    }

    public void generate(ReportData data, String format) {

        if ("CSV".equalsIgnoreCase(format)) {
            csvWriter.write(data);
        } else if ("PDF".equalsIgnoreCase(format)) {
            pdfWriter.write(data);
        } else {
            throw new IllegalArgumentException("Unsupported report format");
        }
    }
}