//60172981 ��ǿ�
//Drawable�� implement ����

public class Text implements Drawable{
	String str;
	
	public Text(String str) {
		this.str = str;
	}
	public void draw() {
		System.out.println(str);
	
	}
}
