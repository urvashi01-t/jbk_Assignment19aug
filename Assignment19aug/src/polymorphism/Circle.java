package polymorphism;

public class Circle implements shape{
int radius;

public Circle(int radius) {
	this.radius = radius;
}

@Override
public void calculateArea( ) {

	int area= 22/7*radius*radius;
	System.out.println("area is "+area);
}

@Override
public void calculatePerimeter() {
	int perimeter=2*22/7*radius;
	System.out.println("perimeter "+perimeter);
}

}
