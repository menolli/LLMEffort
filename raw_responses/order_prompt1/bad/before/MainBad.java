import java.util.List;
import java.util.Map;

public class MainBad {

    public static void main(String[] args) {

        Map<String, Object> item1 = Map.of(
                "product", "Livro",
                "price", 50.0,
                "quantity", 2
        );

        Map<String, Object> item2 = Map.of(
                "product", "Caneta",
                "price", 5.0,
                "quantity", 3
        );

        List<Map<String, Object>> items = List.of(item1, item2);

        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(items, "CREDIT_CARD");
    }
}