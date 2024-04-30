package ObjectOrientedProgramAssignment.notificationsender;

public class SMSNotificationSender implements SMSNotification {
    private long phoneNumber;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SMSNotificationSender(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification() {
        System.out.println("Basic send notification for the phone number");
    }

    @Override
    public void sendSMSNotification() {
        System.out.println("Sending SMS notification to the number " + phoneNumber);
    }
}
