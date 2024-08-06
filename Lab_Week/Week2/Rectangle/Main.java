// Define the Main class
public class Main {
    // Define the main method which is the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the Rectangle class with the width 7 and height 12
        Rectangle rectangle = new Rectangle(25, 30);

        // Print the area of the rectangle to the console
        System.out.println("The area of the rectangle is " + rectangle.getArea());
        // Print the perimeter of the rectangle to the console
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());
    }
} 