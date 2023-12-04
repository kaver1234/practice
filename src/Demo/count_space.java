package Demo;

public class count_space {
	
	public static void main(String[] args) {
		
		
		String name="Su war  na";
		int space=0;
	
		for(int i=0;i<=name.length()-1;i++)
		{
			
			
			if(name.charAt(i)==' ')
			{
				space++;
			}
			
		}
		System.out.println("count is"+space);
		
		
	}

}
