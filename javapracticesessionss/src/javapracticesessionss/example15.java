package javapracticesessionss;
import java.util.Scanner;
public class example15 {

	public static void main(String[] args) {
		int no1,no2,sum,sub,div,mul;
		Scanner sc=new Scanner (System.in);
System.out.println("Enter the nos");
no1=sc.nextInt();
no2=sc.nextInt();
sum=no1+no2;
sub=no1-no2;
div=no1/no2;
mul=no1*no2;
System.out.println("The sum =" +sum+"\nThe sub =" +sub+"\nThe div =" +div+"\nThe mul =" +mul);
	}

}
