public class NotificationService {

    private final NotificationChannel channel;

    public NotificationService(NotificationChannel channel) {
        this.channel = channel;
    }

    public void notify(Notification notification) {
        channel.send(notification);
    }
}