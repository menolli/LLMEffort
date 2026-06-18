public class WhatsAppChannel implements NotificationChannel {

    @Override
    public void send(Notification notification) {
        System.out.println(
            "Sending WhatsApp message to " +
            notification.getRecipient() +
            ": " +
            notification.getMessage()
        );
    }
}