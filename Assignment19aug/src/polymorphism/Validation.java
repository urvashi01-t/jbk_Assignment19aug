package polymorphism;

public class Validation {
public static void main(String[] args) {
	Circle c=new Circle(3);
	c.calculateArea();
	c.calculatePerimeter();
	Rectangle r = new Rectangle(2,4);
	r.calculateArea();
	r.calculatePerimeter();
	Triangle t= new Triangle(1,2,3);
	t.calculateArea();
	t.calculatePerimeter();
}
}
