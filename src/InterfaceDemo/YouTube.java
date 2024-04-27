package InterfaceDemo;

public class YouTube implements AudioMediaPlayer, VideoMediaPlayer {

    @Override
    public void record() {
        System.out.println("record the playing session");

    }

    @Override
    public void caption() {
        System.out.println("change the caption");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Increase  the playing speed");
    }

    @Override
    public void play() {
        System.out.println("start the player");
    }

    @Override
    public void stop() {
        System.out.println("stop the player");
    }

    @Override
    public void rewind() {
        System.out.println("rewind the player");
    }

    @Override
    public void pause() {
        System.out.println("pause the player");
    }

    public void followers() {
        System.out.println("no  of followers");
    }
}
