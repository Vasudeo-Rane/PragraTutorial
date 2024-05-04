package Exception;

import encapsulation.Patient;

public class NullPointException {
    static Patient patient;

    public static void main(String[] args) {
        NullPointException.patient.getId();

    }
}
