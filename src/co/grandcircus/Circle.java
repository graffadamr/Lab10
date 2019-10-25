package co.grandcircus;

public class Circle {
	
	private double radius;
	private double circumference;
	private double area;
	
	
	public Circle () {
	}
	
	
	public void setRadius (double rad) {
		if (rad <= 0) {
			System.out.println("You must enter a valid number!");
		}
	else {
		radius = rad; }
		
	}
		
	public double getCircumference() {
		circumference = ((2 * radius) * Math.PI);
		return circumference;
		
		
	}
	
	public double getArea() {
		area = (radius * radius) * Math.PI; 
		return area;
		
	}
		
	private static String formatNumber(double x) {
		return String.format("%.2f", x);
		
		
	}
	
	public String getFormattedCircumference() {
		return "Circumference: " + formatNumber(circumference);
	}
	
	public String getFormattedArea() {
		return "Area: " + formatNumber(area);
		
	}
	
	
	}


