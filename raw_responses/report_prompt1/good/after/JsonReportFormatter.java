import org.json.JSONObject;

public class JsonReportFormatter implements ReportFormatter {

    @Override
    public void write(ReportData data) {
        JSONObject json = new JSONObject();
        json.put("values", data.getValues());
        json.put("total", data.getTotal());
        System.out.println("JSON REPORT");
        System.out.println(json.toString(2)); // Pretty print with an indent of 2 spaces
    }
}
