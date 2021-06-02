package tutorials.basic;

public class Methods {
         public static void main(String[] args) {
        	 sayHelloTo("charlie") ; 
        	int x=returnFive();
        	System.out.println(x);
        	int result=square(5);
        	System.out.println(result);
        	
			
		}
         static int square(int x)
         {
        	 return x*x;
         }
         
         static int returnFive()
         {
        	 return 5;
         }
         static void sayHelloTo(String name)
         
         {
        	 System.out.println("hello,"+ name);
         }
         static void sayHelloWorld()
			{
				System.out.println("Hello World!");	}
		}


