package ObjectOrientedProgramAssignment.notificationsender;

public class MainSendorNotification {
    public static void main(String[] args) {
        SMSNotification smsNotification = new SMSNotificationSender(987654321);
        smsNotification.sendSMSNotification();
        smsNotification.sendNotification();

        EmailNotification emailNotification = new EmailNotificationSender("vasu.rane@gmail.com");
        EmailNotificationSender emailNotificationSender = (EmailNotificationSender) emailNotification;
        emailNotification.sendEmailNotification();


        emailNotificationSender.setEmailId("vasu_rane@yahoo.co.in");
        emailNotificationSender.sendEmailNotification();

        PushNotification pushNotification = new PushNotificationSender();
        pushNotification.pushNotification();


    }
}
