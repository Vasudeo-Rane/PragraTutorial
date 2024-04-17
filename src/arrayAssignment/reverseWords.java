package arrayAssignment;

public class reverseWords {
    public static void main(String[] args) {
        String s = new String("Hi this is Sam");
        System.out.println(s);
        String[] s1 = s.split(" ");

        for (int i = 0; i < s1.length / 2; i++) {
            String temp = s1[i];
            s1[i] = s1[s1.length - i - 1];
            s1[s1.length - i - 1] = temp;
        }

        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i] + " ");
        }
    }

}
