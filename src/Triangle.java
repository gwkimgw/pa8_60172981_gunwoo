//60172981 김건우
//Shape에서 inherit한 method를 구현, 결과 값을 return

public class Triangle extends Shape implements Drawable, Movable{
	double x, y, bottom, length, diagonal;
	
	public Triangle(int i, int j, double k, double l) {
		x = i;
		y = j;
		bottom = k;
		length = l;
	}
	public void draw() {
		double m = x + bottom / 2;
		double n = x - bottom / 2;
		double o = y + length;
		
		System.out.println("Triangle (" + x + ", " + y + ")-(" + n + ", " + o + ")-(" + m + ", " + o + ")");
	}

	public double getArea() {
		return (bottom * length)/2;
	}

	public double getLength() {
		diagonal = Math.sqrt((bottom) / 2 * (bottom) / 2 + length * length);
		return diagonal * 2 + bottom;
	}

	public void move(double dx, double dy) {

	}
}
