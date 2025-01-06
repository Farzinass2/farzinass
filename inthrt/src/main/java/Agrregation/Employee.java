package Agrregation;

public class Employee {
	int age;
	String name;
	Details d1;
	Employee(int age,String name,Details d1)
	{
		this.age=age;
		this.name=name;
		this.d1=d1;
	}
	public void display()
	{
		System.out.println(name+" "+age);
		System.out.println(d1.city+" "+d1.state+" "+d1.country);
	}

	public static void main(String[] args) {
		Details obj1=new Details("banglore","karnataka","India");
		// TODO Auto-generated method stub
		Employee obj=new Employee(20,"arun",obj1);
		obj.display();
		
		

	}

}
