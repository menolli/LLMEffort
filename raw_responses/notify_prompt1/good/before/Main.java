public class Main {

    public static void main(String[] args) {

        Notification notification = new Notification(
            "user@email.com",
            "Your order has been shipped"
        );

        NotificationChannel channel = new EmailChannel();
        NotificationService service = new NotificationService(channel);

        service.notify(notification);
    }
}