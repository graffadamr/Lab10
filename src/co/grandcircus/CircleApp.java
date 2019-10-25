package co.grandcircus;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Circle circle = new Circle();
		String contQuest = "";
		int counter = 0;
		
		do {
			
		System.out.println("Welcome to the Circle Tester!");
		System.out.println("Enter radius: ");
		double rad = scan.nextDouble();
		circle.setRadius(rad);
		circle.getCircumference();
		circle.getArea();
		System.out.println(circle.getFormattedCircumference());
		System.out.println(circle.getFormattedArea());
		System.out.println("Continue? (y/n) ");
		counter = counter + 1;
		contQuest = scan.next();
		
		} while (contQuest.equalsIgnoreCase("y")); 
		System.out.println("Goodbye! You created " + counter + " circles today!");
		
		scan.close();
	}
}
