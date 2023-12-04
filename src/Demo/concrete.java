package Demo;

public class concrete extends abstartc {

	@Override
	public void div() {
		System.out.println("incomplete method is complete here");
		
	}

	@Override
	public void mul() {
		System.out.println("incomplete method  is complete here");
	}

	public static void main(String[] args) {
		
		concrete c1= new concrete();
		c1.add(); //abstract class complete method
		c1.sub();
		
		c1.div();//abstract class incomplete method completed here
		c1.mul();
	}
}
