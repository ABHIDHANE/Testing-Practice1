package pack123;

public class method {
	static int add(int a, int b)
	{
		int c= a+b;
	System.out.println("c="+c);
	}
	public static void main(String[] args) {
		int x;
		x= method.add(100, 200);
		System.out.println("x="+x);
		x= method.add(x, 2);
		System.out.println("x="+x);	
		x= method.add(x, 35);
		System.out.println("x="+x);
		x= method.add(x, 68);
		System.out.println("x="+x);
	}
}
