package atu.ie.week5;

import java.awt.*;
import java.util.Scanner;

public class ShapeApp {

    public static void main(String[] args)
    {
        // Created first instance of rectangle
        System.out.println("Please enter the length of the rectangle");
        Scanner input = new Scanner(System.in);
        double  length = input.nextDouble();
        rectangle shapeRect = new rectangle();
        shapeRect.setLength(length);
        System.out.println("You entered: " + shapeRect.getLength());

        System.out.println("Please enter the width of the rectangle");
        double  width = input.nextDouble();
        shapeRect.setWidth(width);
        System.out.println("You entered: " + shapeRect.getWidth());

        // Created second instance of rectangle
        System.out.println("Please enter second the length of the rectangle");
        double length2 = input.nextDouble();
        rectangle shapeRect2 = new rectangle();
        shapeRect2.setLength(length2);
        System.out.println("You entered: " + shapeRect2.getLength());


        System.out.println("Please enter the second width of the rectangle");
        double  width2 = input.nextDouble();
        shapeRect2.setWidth(width2);
        System.out.println("You entered: " + shapeRect2.getWidth());

        rectangle shapeRect3 = new rectangle(5,3);
        System.out.println("You entered for length: " + shapeRect3.getLength());
        System.out.println("You entered for width: " + shapeRect3.getWidth());
    }
}
