package Demo;

public class cons {

	int num;
	int num1;
	
	String name;
	
	cons(String n)
	{
		name=n;
	}
	
	cons(int a ,int b){
		
		num=a;
		num1=b;
		
	}
	
	public void add()
	{
		System.out.println(num+num1);
	}
	
	public void name1()
	{
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		cons c1=new cons(10,90);
		c1.add();
		
		cons c2=new cons("kaveri");
		c2.name1();
	}
}
