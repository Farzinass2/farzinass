package Agrregation;

public class Bike {
	String name;
	Vehicle d2;
	Bike(String name,Vehicle d2)
	{
		this.name=name;
		this.d2=d2;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(d2.color+" "+d2.modelno);
	}
	public static void main(String[] args) {
		Vehicle obj1= new Vehicle ("red",2020);
		Bike obj2=new Bike ("arya",obj1);
		obj2.display();
		
		
		
		// TODO Auto-generated method stub

	}

}
