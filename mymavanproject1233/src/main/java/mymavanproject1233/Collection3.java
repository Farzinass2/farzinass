package mymavanproject1233;

import java.util.ArrayList;
import java.util.List;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>obj=new ArrayList<Integer>();
		obj.add(12);
		obj.add(14);
		obj.add(34);
		
		System.out.println(obj);
		for(int temp:obj)
		{
			System.out.println(temp);
		}

	}

}