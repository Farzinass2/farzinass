package Hiop;

public class thisconstructor {
 thisconstructor()
 {
	 this(2);
	 System.out.println("hai");
 }
 thisconstructor(int a)
 {
	 System.out.println(a);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisconstructor obj=new thisconstructor(8);

	}

}
