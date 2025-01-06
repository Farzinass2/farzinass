package javapracticesessionss;
import java.util.Scanner;
public class example13 {

	public static void main(String[] args) {
		int no1,no2,sum;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the numbers");
		 no1=sc.nextInt();
		no2=sc.nextInt();
sum=no1+no2;
System.out.println("The sum =" +sum);
sc.close();
	}

}
