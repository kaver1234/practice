package Demo;

public class conss {
	
	 int num;
	 int num2;
	 String name;
	conss(int a,int c)
	{
		num =a;
		num2=c;
		
	}
	conss(String n,int b)
	{
		name=n;
		num2=b;
	}
	
	public void add()
	{
		System.out.println("addition is :-"+(num+num2));
	}
	public void StudentInfo()
	{
		System.out.println("name is :-"+name+"number is"+num2);
	}
	
	public static void main(String[] args) {
		
		conss c1 =new conss(2,2);
		c1.add();
		conss c2 =new conss("kaveri",2);
		c2.StudentInfo();
		
		
	}
}
