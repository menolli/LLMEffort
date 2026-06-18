public class SmsChannel implements NotificationChannel {

    @Override
    public void send(Notification notification) {
        System.out.println(
            "Sending SMS to " +
            notification.getRecipient() +
            ": " +
            notification.getMessage()
        );
    }
}