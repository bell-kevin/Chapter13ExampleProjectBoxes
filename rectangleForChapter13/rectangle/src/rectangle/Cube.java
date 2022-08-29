/** ****************************************************************************
 * Cube.java
 * Kevin Bell
 *
 * This class demonstrates the extension from the rectangle class.
 **************************************************************************** */
package rectangle;

public class Box extends Rectangle {

    public double height, volume;

    public Box() {
        super("unknown box", 1, 1);
        height = 1;
    } // end constructor

    public Box(String name, double length, double width, double height) {
        super("unknown box", 1, 1);
        this.height = height;
    } // end constructor

    public double getHeight() {
        return this.height;
    } // end accessor method

    public double getVolume() {
        volume = length * width * height;
        return this.volume;
    } // end accessor method

    void setHeight(double height) {
        this.height = height;
    } // end mutator method

    public boolean isCube() {
        return (width == height) && (length == width) && (length == height);
    } // end isCube method

    @Override
    public String display() {
        String result = this.name + ", " + "dimensions: "
                + getLength() + " x " + getWidth() + " x " + getHeight() + "\n";
        if (isCube()) {
            result += "This object is a cube \n";
        } else {
            result += "This object is not a cube \n";
        } // end if/else condition
        result += "Volume: " + this.volume + "\n";
        //System.out.println(result);
        return result;
    } // end display method
} // end Box class
