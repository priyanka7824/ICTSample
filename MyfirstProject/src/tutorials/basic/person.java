package tutorials.basic;

public class person {
	String name;//instance variable
	int age;
	
	public person(String name)
	{
		this.name=name;
		System.out.println("Person Created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sayHelloTo(person person) {
		System.out.println(getName() + " said Hello to " + person.getName());
		// TODO Auto-generated method stub
		
	}

}
