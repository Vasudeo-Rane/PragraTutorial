package Apr13;

public class StringDemo {
    public static void main(String[] args) {
        String s = "pragra";
        int length = s.length();
        String p = "";
        for (int i = 0; i < length; i++) {
            p = p + s.charAt(length - i - 1);
        }
        System.out.println(p);
    }
}
