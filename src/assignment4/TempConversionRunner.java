package assignment4;

public class TempConversionRunner {
    public static void main(String[] args) {
        TempConversion celsiusToFarenheit = new TempConversion();
        double Result = celsiusToFarenheit.convertTemp(32);
        System.out.println("celsiusToFarenheit " + Result);

        TempConversion celsiusToKelvin = new TempConversion();
        Result = celsiusToFarenheit.convertTemp(32, 273.15);
        System.out.println("celsiusToKelvin " + Result);


    }
}
