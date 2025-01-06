package inthrt;

public class Multilevel2 extends Multilevel1 {
	public void show2()
	{
		System.out.println("racingfrom");
	}

	public static void main(String[] args) {
		Multilevel2 obj=new Multilevel2();
		obj.show2();
		obj.show1();
		obj.show();
		

	}

}
