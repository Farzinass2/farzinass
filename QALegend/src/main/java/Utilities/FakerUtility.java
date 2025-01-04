package Utilities;

import java.util.Random;

import org.apache.poi.ss.formula.functions.Address;

import com.github.javafaker.Faker;

public class FakerUtility {
	public static int randomNumberGenerator() {
		Random random=new Random();
		int ranNumber=random.nextInt(10000);
		return ranNumber;
		
	}
	public static String randomEmailGenerator() {
		Random random=new Random();
		int ranNumber=random.nextInt(10000);
		String emailId="newemail"+ranNumber+"@gmail.com";
		return emailId;
	}
public  String getFakerFirstName()
{
	Faker faker=new Faker();
	com.github.javafaker.Address address=faker.address();
	String text=address.firstName();
	return text;
	}
public String getFakerLastname() 
{
	Faker faker=new Faker();
	com.github.javafaker.Address address=faker.address();
	String text=address.lastName();
	return text;
	}
public static String uniqueStringGenerator() {
	// TODO Auto-generated method stub
	return null;
}
}
