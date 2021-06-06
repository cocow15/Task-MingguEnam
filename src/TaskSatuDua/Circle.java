package TaskSatuDua;

public class Circle {
	 // private instance variable, not accessible from outside this class
	 private double radius;
	 private String color;
	 
	 // Constructors (overloaded)
	 public Circle() { // 1st (default) constructor
		 radius = 1.0;
		 color = "red";
	 }
	 
	 public Circle(double r) { // 2nd constructor
		 radius = r;
		 color = "red";
	 }
	 
	 public Circle(double r, String color) {
		 this.radius = r;
		 this.color = color;
	 }
	 
	 void setColor(String color) {
		 this.color = color;
	 }
	 
	 String getColor() {
		 return color;
	 }
	 
	 /** Returns the radius */
	 public double getRadius() {
		 return radius; 
	 }
	 
	 /** Returns the area of this Circle instance */
	 public double getArea() {
		 return radius*radius*Math.PI;
	 }
	 /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
	 public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	 }
}
