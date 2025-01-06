package mypcck;

import org.testng.annotations.Test;

public class Mnb {
	int a=10;
	int b=20;
	int c=a+b;
	int d=a-b;
	int e=a/b;
	int f=a*b;
  @Test(priority=3)
  public void f1() {
	  System.out.println("Sum=" +c+"\nThe Sub=" +d+"\nThe Div=" +e+"\nThe Mul =" +f);
  
  }
  @Test(priority=2)
  public void f2() {
	  System.out.println("Sum=" +c);
  }
  @Test(priority=1)
  public void f3() {
	  System.out.println("Sum=" +c+"\nThe Sub=" +d);
  }
}
