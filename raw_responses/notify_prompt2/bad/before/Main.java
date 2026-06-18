public class Main {

    public static void main(String[] args) {

        Notification notification = new Notification(
            "user@email.com",
            "Your order has been shipped"
        );

        NotificationService service = new NotificationService();
        service.notify(notification, "EMAIL");
    }
}