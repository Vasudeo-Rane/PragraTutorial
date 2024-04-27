package InterfaceDemo;

public class MainClass {
    public static void main(String[] args) {
        YouTube youTubePremium = new YouTubePremium();

        youTubePremium.play();
        youTubePremium.followers();

        YouTubePremium youTubePremium1 = new YouTubePremium();
        youTubePremium1.subscription();

        YouTube youTube = new YouTube();
        youTube.followers();


    }

}
