//60172981 김건우
//Drawable을 implement하고 Rectangle과 Shape가 inherit할 method를 정의
//Movable을 implement하고 Square, Triangle, Bear가 inherit할 method를 정의

import java.io.*;
import java.util.ArrayList;

public abstract class Shape implements Drawable, Movable {

	public abstract double getArea();
	public abstract double getLength();
	public abstract void move(double dx, double dy);
	
	public static void main(String[] args) {
		Shape[] shapes = new Shape[5];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 40, 40);
		shapes[2] = new Circle(50, 20, 30);
		shapes[3] = new Square(10, 10, 10);
		shapes[4] = new Triangle(10, 10, 10, 10);
		
		for(Shape s: shapes) {
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n", s.getLength());
		}
		
		ArrayList <Drawable> drawables = new ArrayList <Drawable>();
		for(int i = 0; i < shapes.length; i++) {
			drawables.add(shapes[i]);
		}
		drawables.add(5, new Text("Sample Text"));
		drawables.add(6, new Bear(100, 100, 20));
		for(Drawable d : drawables) {
			d.draw();
		}
		Circle cir = new Circle(100, 100, 20);
		cir.move(10, 10);
	}
}
