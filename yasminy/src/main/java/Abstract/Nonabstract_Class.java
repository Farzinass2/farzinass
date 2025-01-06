package Abstract;

public class Nonabstract_Class extends Abstract_Class {
	public void show1()
	{
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonabstract_Class obj1=new Nonabstract_Class();
		obj1.show1();
		
obj1.display();
	}

}
