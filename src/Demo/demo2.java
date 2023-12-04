package Demo;

public class demo2 {

	static	int  num=20;
	
	public void m1(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	static public void m2(int x, int y)
	{
		int z=x/y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		
		demo2 d2=new demo2();
		d2.m1(20, 40);
	    m2(6,3);
	    
	    demo1 d1= new demo1();
	    d1.m3(5,5);
	    
	    demo1.m4(6, 3);
	}
	
}
