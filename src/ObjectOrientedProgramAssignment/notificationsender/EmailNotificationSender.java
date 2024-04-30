package ObjectOrientedProgramAssignment.notificationsender;

public class EmailNotificationSender implements EmailNotification {

    private String emailId;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public EmailNotificationSender(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void sendEmailNotification() {
        System.out.println(" This is a email notification for " + emailId);
    }

    @Override
    public void sendNotification() {

    }
}
