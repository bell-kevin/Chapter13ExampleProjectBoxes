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
        double length = 0, width = 0, height =0; // i don't know if i did this part wrong
        paper.setLength(length);
        paper.setWidth(width);
        paper.isSquare();
        paper.getPerimeter();
        paper.getArea();
        paper.display();
    } // end main method
} // end class rectangle
