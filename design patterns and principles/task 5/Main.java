public class Main {
    public static void main(String[] args) {
        // Base Notifier
        Notifier email = new EmailNotifier();

        // Decorated with SMS
        Notifier emailAndSMS = new SMSNotifierDecorator(email);

        // Decorated with Slack
        Notifier allChannels = new SlackNotifierDecorator(emailAndSMS);

        // Send Notification
        allChannels.send("Server is down! Please check immediately.");
    }
}