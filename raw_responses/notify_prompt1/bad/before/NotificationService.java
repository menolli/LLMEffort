public class NotificationService {

    private final EmailService emailService;
    private final SmsService smsService;

    public NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SmsService();
    }

    public void notify(Notification notification, String channel) {

        if ("EMAIL".equalsIgnoreCase(channel)) {
            emailService.send(
                notification.getRecipient(),
                notification.getMessage()
            );
        } else if ("SMS".equalsIgnoreCase(channel)) {
            smsService.send(
                notification.getRecipient(),
                notification.getMessage()
            );
        } else {
            throw new IllegalArgumentException(
                "Unsupported notification channel"
            );
        }
    }
}