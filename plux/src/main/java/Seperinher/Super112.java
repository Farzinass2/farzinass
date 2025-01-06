package Seperinher;

public class Super112 extends Super111 {
	String name="remya";
	public void display()
	{
	System.out.println(super.name);
	System.out.println(name);
	}
	public static void main (String args[])
	{
		Super112 obj=new Super112();
		obj.display();
		
		
	}

}
