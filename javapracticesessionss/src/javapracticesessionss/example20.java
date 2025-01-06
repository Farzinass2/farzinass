package javapracticesessionss;

import java.util.Scanner;

public class example20 {

	public static void main(String[] args) {
		double r,area,cir;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		r=sc.nextInt();
		
area=Math.PI*r*r;
cir=Math.PI*2*r;
System.out.println("The area =" +area+"\nThe circumference =" +cir);
	}

}


	
