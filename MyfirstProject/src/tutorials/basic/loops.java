package tutorials.basic;

public class loops {
	public static void main(String[] args) {
		
		//whileloop();
		dowhileloop();
	}
		
		static void whileloop()
		
		{		int counter=0;
		while( counter <10)
		{
			counter=counter+1;
			System.out.println(counter);
		}
		}
		static void dowhileloop()
		{
			int counter=10;
			do
			{
				counter=counter+1;
			System.out.println(counter);
		}
			while(counter<10);
		}
	
			

}
