public class WhatsAppChannel implements NotificationChannel {

    @Override
    public void send(Notification notification) {
        System.out.println(
            "Sending WHATSAPP to " +
            notification.getRecipient() +
            ": " +
            notification.getMessage()
        );
    }
}