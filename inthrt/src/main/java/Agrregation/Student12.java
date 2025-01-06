package Agrregation;

public class Student12 {
	String name;
	Detail12 d3;
	Student12(String name,Detail12 d3)
	{
		this.name=name;
		this.d3=d3;
	}
	public void display12()
	{
		System.out.println(name);
		System.out.println(d3.name+ " "+d3.age+" " +d3.id);
	}

	public static void main(String[] args) {
		Detail12 obj1=new Detail12("arun",23,10);
		Student12 obj2=new Student12("kashika",obj1);
		
		obj2.display12();
		
		// TODO Auto-generated method stub

	}

}
