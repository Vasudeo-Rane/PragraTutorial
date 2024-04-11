package assignment4;

public class TempConversion {

    public double convertTemp(int celcius) {
        double farenheit = (celcius * (9 / 5)) + 32;
        return farenheit;
    }

    public double convertTemp(int celcius, double constant) {
        double kelvin = celcius + constant;
        return kelvin;
    }

}
