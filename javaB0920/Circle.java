package javaB0920;

public class Circle {
	static double PI = 3.14;
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI*radius*radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
