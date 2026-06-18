public class EmailChannel implements NotificationChannel {

    @Override
    public void send(Notification notification) {
        System.out.println(
            "Sending EMAIL to " +
            notification.getRecipient() +
            ": " +
            notification.getMessage()
        );
    }
}