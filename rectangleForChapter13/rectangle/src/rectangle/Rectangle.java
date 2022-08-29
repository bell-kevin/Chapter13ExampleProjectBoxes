/** ****************************************************************************
 * Rectangle.java
 * Kevin Bell
 *
 * This class is the parent/super class of this program.
 **************************************************************************** */
package rectangle;

public class Rectangle {

    public double length, width, perimeter, area;
    String name = "unknown";

    public Rectangle() {
        this.name = "unknown";
        this.length = 1;
        this.width = 1;
    } // end constructor

    public Rectangle(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    } // end constructor

    public double getPerimeter() {
        return this.perimeter;
    } // end accessor method

    public double getArea() {
        return this.area;
    }// end accessor method

    public double getLength() {
        return this.length;
    }// end accessor method

    public double getWidth() {
        return this.width;
    }// end accessor method

    void setLength(double length) {
        this.length = length;
    } // end mutator method

    void setWidth(double width) {
        this.width = width;
    } // end mutator method

    public boolean isSquare() {
        if (length == width) {
            return true;
        } else {
            return false;
        } // end if/else condition
    } // end isSquare method

    public String display() {
        String result = "New object: \n" + this.name + ", " + "dimensions: "
                + getLength() + " x " + getWidth() + "\n";
        if (isSquare()) {
            result += "This object is a square \n";
        } else {
            result += "This object is not a square \n";
        } // end if/else condition
        perimeter = 2 * length + 2 * width;
        area = length * width;
        result += "Perimeter: " + this.perimeter + "\n";
        result += "Area: " + this.area;
        System.out.println(result);
        return result;
    } // end display method
} // end rectangleClass class
