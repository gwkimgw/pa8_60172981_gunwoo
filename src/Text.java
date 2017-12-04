//60172981 김건우
//Drawable을 implement 구현

public class Text implements Drawable{
	String str;
	
	public Text(String str) {
		this.str = str;
	}
	public void draw() {
		System.out.println(str);
	
	}
}
