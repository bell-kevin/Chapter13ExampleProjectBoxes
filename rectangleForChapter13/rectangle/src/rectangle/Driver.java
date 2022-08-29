/** ****************************************************************************
 * Driver.java
 * Kevin Bell
 *
 * This driver program demonstrates inheritance.
 **************************************************************************** */
package rectangle;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        System.out.println("Ch 6 Rectangle Project by Kevin Bell \n");
        Rectangle paper = new Rectangle();
        ArrayList<Rectangle> rectangle = new ArrayList<>();
        ArrayList<Cube> cube = new ArrayList<>();
        Rectangle r1 = new Rectangle("Birthday card", 6.5, 6.5);
        Rectangle r2 = new Rectangle();
        r2.setWidth(8.5);
        r2.setLength(11);
        double length = 0, width = 0, height = 0;
        paper.setLength(length);
        paper.setWidth(width);
        paper.isSquare();
        paper.getPerimeter();
        paper.getArea();
        paper.display();
    } // end main method
} // end class rectangle
