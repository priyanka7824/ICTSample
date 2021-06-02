package tutorials.basic;


public class classesandobjects {
	public static void main(String[] args) {
	
		
		person john=new person("John");
		john.setAge(20);
		
		person bob=new person("Bob");
		bob.setAge(25);
		
		john.sayHelloTo(bob);
		System.out.println(john.getName() + " is " + john.age + " years old ");
		System.out.println(bob.getName() + " is "+ bob.age + " years old ");
	}
}
		
