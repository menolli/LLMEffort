public class PdfReportWriter {

    public void write(ReportData data) {
        System.out.println("PDF REPORT");
        for (Double v : data.getValues()) {
            System.out.println("Value: " + v);
        }
        System.out.println("Total: " + data.getTotal());
    }
}