package polymorphism;

public class Triangle implements shape {
int a;
int b;
int c;

	public Triangle(int a, int b, int c) {
	this.a = a;
	this.b = b;
	this.c = c;
}

	@Override
	public void calculateArea() {
int area=1/2*a*b;	
System.out.println("area"+area);

	}

	@Override
	public void calculatePerimeter() {
		int perimeter=a+b+c;
		System.out.println("perimeter"+perimeter);
	}

}
