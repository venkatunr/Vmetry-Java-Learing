package string_litertal;

public class StringLiterlTest {

	public static void main(String[] args) {
		String a="Vmetry";
		String b="Vmetry";
		String c=new String("Vmetry");
		String d=new String("Vmetry");
		
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(c==d);
		System.out.println("---------------");
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(c.equals(d));

	}

}