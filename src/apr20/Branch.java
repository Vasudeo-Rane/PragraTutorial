package apr20;

public class Branch {
    String address;
    int branchCode;

    public Branch(String address, int branchCode) {
        this.address = address;
        this.branchCode = branchCode;
    }

    public String toString() {
        return "branch Code is " + branchCode + " : Address is " + address;
    }
}
