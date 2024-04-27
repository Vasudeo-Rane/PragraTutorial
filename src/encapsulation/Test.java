package encapsulation;

public class Test {
    public static void main(String[] args) {

        Patient p = new Patient();
        p.setId(123);
        p.setName("Vasu");
        p.setSsn("1234567890");
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getSsn());

    }
}