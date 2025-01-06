package jumpingstatements;

public class thisclassmethod {

	
		public void show()
		{
		System.out.println("Welcome");	
		}
		public void display()
		{
			this.show();
			System.out.println("to ooty");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			thisclassmethod obj=new thisclassmethod();
			obj.display();
		}

	}


