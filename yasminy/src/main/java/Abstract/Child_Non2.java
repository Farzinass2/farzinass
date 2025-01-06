package Abstract;

public class Child_Non2 extends Parent_Abstract {
	public void show1()
	{
		System.out.println("tomorrow");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_Non2 obj1=new Child_Non2();
		Child_Non1 obj2=new Child_Non1();
			obj1.show1();
		obj1.display1();
		obj2.show1();
	}

}