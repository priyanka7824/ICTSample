package tutorials.basic;

public class ReferencesAndVariables {
	public static void main(String[] args) {
		
		int x=5;
		addOneTo(x);//we are passing a value type,so we pass a copy of the value of x,which is 5
		
		System.out.println(x);
		person john;
		john=new person("John");//creating a new person object,and assigning john to refer to it
		john.setAge(20);
		celebrateBirthday(john);//passing that reference to a method,so the method can use that reference to manipulate that object
		System.out.println(john.getAge());
	}
	
	private static void celebrateBirthday(person john) {
		john.setAge(john.getAge() + 1);
		// TODO Auto-generated method stub
		
	}

	public static void addOneTo(int number)
	{
		number=number+1;
	}

}
