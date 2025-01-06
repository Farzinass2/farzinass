package Gha;

import org.testng.annotations.Test;

public class NewTest09 {
  @Test(priority=2)
  public void f() {
	  System.out.println("Welcome to world of testing");
  }
  @Test(priority=1)
  public void f1() {
	  System.out.println("Welcome to java");
  }
 

}
