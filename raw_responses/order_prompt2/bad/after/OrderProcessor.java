import java.util.List;
import java.util.Map;

public class OrderProcessor {

    public double processOrder(List<Map<String, Object>> items, PaymentMethod paymentMethod) {

        double total = 0.0;

        for (Map<String, Object> item : items) {

            Double price = (Double) item.get("price");
            Integer quantity = (Integer) item.get("quantity");

            total += price * quantity;
        }

        paymentMethod.pay(total);

        System.out.println("Pedido processado com sucesso.");
        return total;
    }
}
