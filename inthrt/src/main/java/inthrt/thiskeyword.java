package inthrt;

public class thiskeyword {
	String name="keerty";
	
	public void show()
	{
		System.out.println("hello");
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		
thiskeyword obj=new thiskeyword();
obj.show();
	}

}
