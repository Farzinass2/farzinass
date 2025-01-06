package inher1;

public class Vehicle extends Gear {

	public void show()
	{
		System.out.println("car race");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj=new Vehicle();
		obj.show();
		obj.dis();
		obj.run();

	}

}
