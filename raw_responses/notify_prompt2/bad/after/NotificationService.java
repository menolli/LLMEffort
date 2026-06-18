public class NotificationService {

    private final EmailService emailService;
    private final SmsService smsService;
    private final WhatsAppService whatsAppService;

    public NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SmsService();
        this.whatsAppService = new WhatsAppService();
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
        } else if ("WHATSAPP".equalsIgnoreCase(channel)) {
            whatsAppService.send(
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
