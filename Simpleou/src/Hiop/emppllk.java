package Hiop;

public class emppllk {
	public  static void display(float a,float b)
	{
		float c=a+b;
		System.out.println(c);
	}
	public static  void show(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public static void show1(int a,int b,int c)
	{
		int d=a*b*c;
	}
	public static void show2(String name,int age,int id)
	{
		System.out.println(name+ " "+age+ "  "+id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emppllk.display(9.0f,10.0f);

		emppllk.show(10,20);
		emppllk.show1(20,10,10);
		emppllk.show2("anu",10,20);
		

	}

}
52