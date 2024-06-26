# Chapter13ExampleProjectBoxes
In Ch 6 in the previous Java course, you created a rectangle project. In this example, you will rework that project to add a box class, which inherits from the rectangle class and extends it by adding a height measurement.  

Note: You may want to copy the project form Ch 6, but there are differences you must be sure to incorporate for this project. The Rectangle class from Ch 6 could be a good started point for the Rectangle class for this project, although there are differences. The driver classes are quite different.  

The rectangle class for this project is the parent or super class, which describes a 2-D objects. It has instance variables for length and width, which are doubles, and also for name, which is a string. Create a default constructor that sets the name to "unknown" and the measurements to 1. Create a 3-parameter constructor that accepts a string and 2 doubles, for the name, length, and width values. Create get and set methods for each instance variable. You won't ask for any user input in this project; all data will be hard-coded in the driver. Include a Boolean method to check if the rectangle is square. Also include methods to get the area and get the perimeter (same as in Ch 6). (Note: Area is the width multiplied by the length; the perimeter is 2 times the length plus 2 times the width.)  

Write a display method in the rectangle class. In that method, create a String variable that has 5 lines of data, and return that String. The first line prints a header that says "New object:", the second line prints the name of the object and its dimensions; the third line prints whether or not the object is a square -- call that Boolean method from the display method; the fourth line prints the perimeter; the fifth line prints the area. 

Next, create a new class for a Box, a 3-D object. This class extends the rectangle class, so it inherits all the variables and methods of the rectangle class. In the box class, add an instance variable for height, which is a double. Create a default constructor that sets all 4 variables (name, length, and width from the super class and height from this class) -- the name should be "unknown box" and the measurements should be 1. Create another constructor that has 4 parameters, a string for name, and 3 doubles for length, width, and height. The set and get methods for the variables for name, length, and width already exist in the super class, do not repeat them here. Add methods to set and get the height variable. Add a method to get the volume of the box (length times width times height). Add a Boolean method to check if the box is a cube, if all 3 instance variables are the same. Create a display method that creates 4 lines: a header line that prints "New Object", a second line that prints the name of the box and its dimensions, a third line that prints whether or note the box is a cube, and a fourth line that prints the volume of the cube. 

Since the super class has a display method, that method with the same name in the sub or child class needs to be an override.  

In the driver class, create 2 array lists, one for the rectangle and one for the boxes. Instantiate 1 of each type of object using the default constructors (no parameters) and add the values for the instance variables using the setter methods. Instantiate another of each type of object using the multi-parameter constructors. One instance object must be a square / cube, the other must not be a square / cube. Add both instance objects to the appropriate array list.   

Next, add 2 anonymous objects for each type and add them directly to the array lists -- do not create variables for these objects, create them anonymously. One needs to be a square / cube, one must not be a square / cube, in these new anonymous instantiations.   

Summary of the Process -- this work needs to be done for each class of object, rectangles and boxes  

1. Create an array list for the class 
2. Create an instance variable for the class using the default constructor (no parameters), and add the values using the setter methods 
3. Create an instance variable for the class using the multi-parameter constructor 
4. Add those instance variables to the array list 
5. Add 2 anonymous objects for the class to the array list 

Rectangles can be square or not; boxes can be cubes or not. There must be 2 of each kind in the 4 objects instantiated for the class -- one of each kind in the instance variables created for the class and then added to the array list, one of each kind in the anonymous objects added to the array list.  

For each type (rectangles and classes), use a for-each loop to display the objects in the array lists. 

Take screenshots of the results. Run the project a second time will all different data and take a screenshot.     

Submission:the specified screenshots and the root folder for the project     

Pay careful attention to the rubric for this assignment.  

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.  

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero. 

Output

![example](https://github.com/bell-kevin/Chapter13ExampleProjectBoxes/blob/main/chapter13exampleProjectBoxes.PNG)

Output

![newData](https://github.com/bell-kevin/Chapter13ExampleProjectBoxes/blob/main/newData.PNG)


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[email me](bellKevin.me) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
