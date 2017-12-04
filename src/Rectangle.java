//60172981 ��ǿ�
//Shape���� inherit�� method�� ����, ��� ���� return

public class Rectangle extends Shape implements Drawable, Movable {
    private double x, y, width, length;

    public Rectangle(double i, double j, double k, double l) {
        x = i;
    	y = j;
    	width = k;
        length = l;
    }

    public double getArea() {
        return width * length;
    }

    public double getLength() {
        return 2 * (width + length);
    }
    
	public void draw() {
		double m = x + width;
		double n = y + length;
		System.out.println("Rectangle (" + x + ", " + y + ")-(" + m + ", " + n + ")");
	}

	public void move(double dx, double dy) {
		
	}
}
