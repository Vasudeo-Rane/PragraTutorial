package ObjectOrientedProgramAssignment.notificationsender;

public class PushNotificationSender implements PushNotification {

    @Override
    public void sendNotification() {
        System.out.println("Basic notification method for PushNotification");

    }

    @Override
    public void pushNotification() {
        System.out.println("Choose the notification method");
    }
}
