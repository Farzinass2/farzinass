package Agrregation;

public class School {
	int studentrollno;
	int id;
	String studentname;
	Studentdetails d4;
	School(int studentrollno,int id,String studentname,Studentdetails d4)
	{
		this.studentrollno=studentrollno;
		this.id=id;
		this.studentname=studentname;
		this.d4=d4;
	}
	public void display()
	{
		System.out.println(studentrollno+" "+id+ " " +studentname);
		System.out.println(d4.name+ " "+d4.id+" "+d4.rollno);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentdetails obj=new Studentdetails("remya",9,10);
		School obj1=new School(12,9,"kalki",obj);
		
		obj1.display();
		

	}

}
