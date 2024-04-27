package InterfaceDemo;

public class MainInheritance {
    public static void main(String[] args) {
        SmartPhone Iphone = new Iphone();
        Iphone.add();
        Iphone.setting();

        Iphone iPhone = (Iphone) Iphone;  //object downcasting
        iPhone.measureDistance();

    }
}
