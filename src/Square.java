//60172981 ��ǿ�
//Shape���� inherit�� method�� ����, ��� ���� return

public class Square extends Shape implements Drawable, Movable{
	double x, y, width;
	
	public Square(int i, int j, double k) {
		x = i;
		y = j;
		width = k;
	}

	public void draw() {
		double m = x + width;
		System.out.println("Square (" + x + ", " + y + ")-(" + m + ", " + m + ")");
	}

	public double getArea() {
		return width * width;
	}

	public double getLength() {
		return 4 * width;
	}

	public void move(double dx, double dy) {

	}
}
