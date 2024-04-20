package apr05;

// RGBColor class representing a color using Red Green Blue (RGB) model.
public class RGBColor {

    private int red;
    private int green;
    private int blue;

    public RGBColor(int red, int green, int blue) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    public int getRed() {
        return this.red;
    }

    // Getter method to get the green value of the color.
    public int getGreen() {
        return this.green;
    }

    // Getter method to get the blue value of the color.
    public int getBlue() {
        return this.blue;
        // write your code here
    }

    // Method to invert the color. The inversion is done by subtracting each color component from 255.
    public void invert() {
        this.red = (255 - this.red);
        this.green = (255 - this.green);
        this.blue = (255 - this.blue);
        // write your code here
    }
}