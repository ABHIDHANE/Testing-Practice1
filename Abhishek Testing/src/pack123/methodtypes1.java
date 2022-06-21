package pack123;

public class methodtypes1 
{
	public static void main(String[] args) 
	{
	
	String a = "Velocity";
	String b = new String("Velocity");
	
	boolean r = a.equals(b);//a==b
	System.out.println(r);
	
	r= a.equalsIgnoreCase(b);
	System.out.println(r);
	
	int size = a.length();
	System.out.println(size);
	
	char s = a.charAt(3);
	System.out.println("s="+s);
	
	a= a.concat("Class");
	System.out.println(a);
	
	a= a.concat("K");
	System.out.println(a);
	
	a= a+ "Batch";
	System.out.println(a);
	
	a= a+ "Abhishek";
	System.out.println(a);
	
	}
}
