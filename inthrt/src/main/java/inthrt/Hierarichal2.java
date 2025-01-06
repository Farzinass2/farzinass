package inthrt;

public class Hierarichal2 extends Hierarichal1{
	public void run()
	{
		System.out.println("world");
	}

	public static void main(String[] args) {
		Hierarichal2 obj=new Hierarichal2();
		obj.run();
		obj.show();
		Hierarichal1 obj1=new Hierarichal1();
		obj.display();
		obj.show();

	}

}
