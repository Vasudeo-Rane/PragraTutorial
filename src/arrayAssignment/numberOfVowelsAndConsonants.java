package arrayAssignment;

public class numberOfVowelsAndConsonants {
    public static void main(String[] args) {
        String s = new String("this is my life");

        int numOfvowel = 0;
        int numOfConsonants = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                        s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
                    numOfvowel++;
                else
                    numOfConsonants++;
            }
        }
        System.out.println("The number of vowel are " + numOfvowel + " and the number of Consonants are " + numOfConsonants);


    }
}
