/** ****************************************************************************
 * Cube.java
 * Kevin Bell
 *
 * This class demonstrates the extension from the rectangle class.
 **************************************************************************** */
package rectangle;

public class Cube extends Rectangle {

    public double height, volume;

    public Cube() {
        super("unknown box", 1, 1);
        height = 1;
    } // end constructor

    public Cube(String name, double length, double width, double height) {
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
    
    public boolean isCube(){
         if ((width == height) && (length == width) && (length == height)) {
            return true;
        } else {
            return false;
        } // end if/else condition
    } // end isCube method
    
    
    //the below section needs work - start here on monday morning
    @Override
    public String display() {
        String result = "New object: \n" + this.name + ", " + "dimensions: "
                + getLength() + " x " + getWidth() + " x " + getHeight() + "\n";
        if (isCube()) {
            result += "This object is a cube \n";
        } else {
            result += "This object is not a cube \n";
        } // end if/else condition
        result += "Volume: " + this.volume + "\n";
        System.out.println(result);
        return result;
    } // end display method
} // end Cube class
