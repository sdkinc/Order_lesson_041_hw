import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Order order001 = new Order(UUID.randomUUID().toString(), "Margarita",
                "Bulgakov", "0123456789", 33);
        Order order002 = new Order(UUID.randomUUID().toString(), "Gioconda",
                "Da Vinci", "0123456879", 999);
        Order order003 = new Order(UUID.randomUUID().toString(), "David",
                "Michelangelo", "1023456879", 142);
        Order.triplePrice(order001);
        order003.doublePrice();
        List<Order> orders = new ArrayList<>();
        orders.add(order001);
        orders.add(order002);
        orders.add(order003);
        System.out.println(orders);
        System.out.println(Order.getTotalSum(orders));
    }
}