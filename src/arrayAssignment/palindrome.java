package arrayAssignment;

public class palindrome {
    public static void main(String[] args) {
        String s = new String("sammas");
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                System.out.println("The string is not palindrome");
        }
        System.out.println("The string " + s + " is palindrome");
    }
}
