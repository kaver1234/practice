package Demo;

public class result_inter implements interface1,interface2 {

	@Override
	public void add() {
		
		System.out.println(a);
		
	}

	@Override
	public void sub() {
		
		System.out.println(a);
		
	}
	
	public void div()
	{
		System.out.println(b);
	}
	
	public void mul()
	{
		System.out.println(b);
	}
public static void main(String[] args) {
	
	result_inter r1=new result_inter();
	
	r1.add();
	r1.sub();
	r1.div();
	r1.mul();
}
}
