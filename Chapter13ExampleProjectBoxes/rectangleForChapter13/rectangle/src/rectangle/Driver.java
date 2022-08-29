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
        ArrayList<Box> boxes = new ArrayList<>();
        ArrayList<Rectangle> papers = new ArrayList<>();
        Rectangle r1 = new Rectangle("Birthday Card", 6.5, 6.5);
        Rectangle r2 = new Rectangle();
        r2.setWidth(8.5);
        r2.setLength(11);
        r2.setName("Printer paper");
        papers.add(r1);
        papers.add(r2);
        papers.add(new Rectangle("Greeting Card", 5, 4));
        papers.add(new Rectangle("Fabric Square", 7, 7));
        Box b1 = new Box("Jewelry box", 5.5, 5.5, 5.5);
        Box b2 = new Box();
        b2.setHeight(3.8);
        b2.setLength(9.5);
        b2.setWidth(6.2);
        b2.setName("Pencil box");
        boxes.add(b1);
        boxes.add(b2);
        boxes.add(new Box("Monitor box", 12.0, 11.0, 10.0));
        boxes.add(new Box("Small shipping box", 6.6, 6.6, 6.6));
        System.out.println("\nArray List of 2-D objects");
        for (Rectangle one : papers) {
            System.out.println("\nNew Object:");
            System.out.println(one.display());
        } // end for loop
        System.out.println("\nArray List of 3-D objects");
        for (Box two : boxes) {
            System.out.println("\nNew Object:");
            System.out.println(two.display());
        } // end for loop
    } // end main method
} // end class Rectangle
