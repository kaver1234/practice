package Demo;

public class Overloading  {
	
	public void m1(int i)
	{
		System.out.println("Integer Arg method");
	}
	public void m1(double d)
	{
		System.out.println("Double Arg method");
	}
	public static void main(String[] args) 
	{
		Overloading t=new Overloading();
		t.m1(10.5f);
	}


}
