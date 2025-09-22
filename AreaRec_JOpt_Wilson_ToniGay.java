/*
 * Program will calculate the area of a rectangle or circle based on user input
 * Programmer : Toni Wilson
 * Date : September 15, 2024
 * Course : CSC-1511-0901
 * Teacher : Mr. Teter
 * 
 * --------------------------------
 * ask user to choose between rectangle or circle
 * if rectangle
 *      ask for length and width
 *     calculate area
 *    display area
 * if circle
 *    ask for radius
 *   calculate area
 *  display area
 * --------------------------------
 * Area of rectangle = length * width
 * Area of circle = π * radius^2
 * --------------------------------
 * 
 */

import javax.swing.JOptionPane;

public class AreaRec_JOpt_Wilson_ToniGay {
    public static void main(String[] args) 
    {
        // user input: rectangle or circle?
        String[] options = {"Rectangle", "Circle"};
        int choice = JOptionPane.showOptionDialog(null,
            "What shape do you want to calculate the area for?",
            "Shape Selection",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);

        if (choice == 0) {
            // Calculate area of rectangle
            calculateRectangleArea();
        } else if (choice == 1) {
            // Calculate area of circle
            calculateCircleArea();
        }

    }

    // Method to calculate rectangle area
    public static void calculateRectangleArea() {
        String lengthStr, widthStr;
        double length, width, area;

        // Get user input
        lengthStr = JOptionPane.showInputDialog("Enter the length of the rectangle:");
        widthStr = JOptionPane.showInputDialog("Enter the width of the rectangle:");

        // Convert input strings to double
        length = Double.parseDouble(lengthStr);
        width = Double.parseDouble(widthStr);

        // Calculate area
        area = length * width;

        // Display result
        JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + area);
    }

    public static void calculateCircleArea() {
        String radiusStr;
        double radius, area;

        // Get user input
        radiusStr = JOptionPane.showInputDialog("Enter the radius of the circle:");

        // Convert input string to double
        radius = Double.parseDouble(radiusStr);

        // Calculate area
        area = Math.PI * Math.pow(radius, 2);

        // Display result
        JOptionPane.showMessageDialog(null, "The area of the circle is: " + area);
    }

}
