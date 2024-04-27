package InterfaceDemo;

public class SmartPhone implements Calculator, Camera, Computer, MusicPlayer {

    @Override
    public void add() {
        System.out.println("add any number");
    }

    @Override
    public void substract() {
        System.out.println("substract any number");
    }

    @Override
    public void multiply() {
        System.out.println("multiply any number");
    }

    @Override
    public void divide() {
        System.out.println("divide any number");
    }

    @Override
    public void takePicture() {
        System.out.println("Take the picture");
    }

    @Override
    public void setting() {
        System.out.println("setting");
    }

    @Override
    public void watchvideo() {
        System.out.println("watch video");
    }

    @Override
    public void dopramming() {
        System.out.println("do programming");
    }

    @Override
    public void playMusic() {
        System.out.println("Play Music player");
    }

    @Override
    public void stopMusic() {

    }

    @Override
    public void rewindMusic() {

    }

    @Override
    public void pauseMusic() {

    }

    public void receiveCall() {
        System.out.println("receive the call");
    }
}
