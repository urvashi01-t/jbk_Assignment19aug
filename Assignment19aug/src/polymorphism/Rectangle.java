package polymorphism;

public class Rectangle implements shape{
int length;
int width;

	public Rectangle(int length, int width) {
	this.length = length;
	this.width = width;
}

	@Override
	public void calculateArea() {
		int area=length*width;
		System.out.println("area "+ area);
	}

	@Override
	public void calculatePerimeter() {
int perimeter=length+width;
System.out.println(perimeter);
	}

}
