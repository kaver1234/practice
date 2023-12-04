package Demo;

public class Constructor1 {
	
	int num1;
    int num2;
    String ename;
    float per;
    
    Constructor1(String a)
    {
    	ename=a;
    }
    
    Constructor1(int a,int b)
    {
    	num1=a;
    	num2=b;
    }
    Constructor1(String s ,float x)
    {
    	ename=s;
    	per=x;
    }
    
    public static void mul()
    {
    	Constructor1 x1=new Constructor1("na");
    	
    	System.out.println(x1.ename);
    	
    	
    }
 public static void main(String[] args) {
	 
	 mul();
	
}
}
