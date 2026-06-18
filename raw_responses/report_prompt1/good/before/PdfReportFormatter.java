public class PdfReportFormatter implements ReportFormatter {

    @Override
    public void write(ReportData data) {
        System.out.println("PDF REPORT");
        for (Double v : data.getValues()) {
            System.out.println("Value: " + v);
        }
        System.out.println("Total: " + data.getTotal());
    }
}