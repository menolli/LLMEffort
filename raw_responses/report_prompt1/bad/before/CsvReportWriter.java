public class CsvReportWriter {

    public void write(ReportData data) {
        System.out.println("CSV REPORT");
        for (Double v : data.getValues()) {
            System.out.println(v);
        }
        System.out.println("TOTAL," + data.getTotal());
    }
}