package InterfaceDemo;

public class YouTubePremium extends YouTube implements AudioMediaPlayer, VideoMediaPlayer {
    public void subscription() {
        System.out.println("No of subscription");
    }
}
