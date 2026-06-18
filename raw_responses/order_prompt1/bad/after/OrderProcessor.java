import java.util.List;
import java.util.Map;

public class OrderProcessor {

    public double processOrder(List<Map<String, Object>> items, String paymentType) {

        double total = 0.0;

        for (Map<String, Object> item : items) {

            Double price = (Double) item.get("price");
            Integer quantity = (Integer) item.get("quantity");

            total += price * quantity;
        }

        if ("CREDIT_CARD".equals(paymentType)) {
            System.out.println("Pagando R$ " + total + " com cartão de crédito.");
        } else if ("PIX".equals(paymentType)) {
            System.out.println("Pagando R$ " + total + " com PIX.");
        } else {
            throw new RuntimeException("Método de pagamento não suportado");
        }

        System.out.println("Pedido processado com sucesso.");
        return total;
    }
}

