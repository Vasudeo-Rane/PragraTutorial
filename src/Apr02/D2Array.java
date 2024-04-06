package Apr02;

public class D2Array {
    public static void main(String[] args) {


        char[][] letters = {{'A', 'a'},
                {'B', 'b'},
                {'C', 'c'}};

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[0].length; j++) {
                System.out.print(letters[i][j]);
            }
        }
    }
}
