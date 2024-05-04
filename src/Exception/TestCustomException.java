package Exception;

public class TestCustomException {
    public static void main(String[] args) {
        throw new UncheckedCustomException("This is not right");
    }
}
