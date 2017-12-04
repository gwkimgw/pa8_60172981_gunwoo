//60172981 김건우
//Shape에서 inherit한 method를 구현, 결과 값을 return

public class Bear extends Shape implements Drawable, Movable {
	
	private double x, y, z;

    public Bear(int i, int j, double k) {
        x = i;
    	y = j;
    	z = k;
    }
    
	public void move(double dx, double dy) {
		
	}

	public void draw() {
		double a = x - z;
		double b = x + z;
		double d = z * 2;
		double e = z / 2;
		Rectangle rec = new Rectangle(a, a, d, d);
		Circle cir1 = new Circle(a, a, e);
		Circle cir2 = new Circle(b, a, e);
		System.out.println("Bear");
		rec.draw();
		cir1.draw();
		cir2.draw();
	}

	public double getArea() {
		return 0;
	}

	public double getLength() {
		return 0;
	}
}
