import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class JsonReportWriter {

    public void write(ReportData data) {
        Map<String, Object> reportMap = new HashMap<>();
        reportMap.put("values", data.getValues());
        reportMap.put("total", data.getTotal());

        Gson gson = new Gson();
        String jsonReport = gson.toJson(reportMap);
        System.out.println("JSON REPORT");
        System.out.println(jsonReport);
    }
}
