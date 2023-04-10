package assignment_package;

import java. util. Scanner;

public class Assignment_Day6 {
	
	
	public int sum(int a, int b)
	{
		int c = a+b;
		return c;
	}
	public int sub(int a, int b) 
	{
		int c = a-b;
		return c;
	}
	public int mul(int a, int b) 
	{
		int c = a*b;
		return c;
	}
	public int div(int a, int b) 
	{
		int c = a/b;
		return c;
	}
	
	public static void main(String[] args) 
	{
		int y;
		System.out.println("Enter the value of x1,x2,x3,x4,x5,x6:");
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
	    System.out.println("Value of x1:" +x1);
	    int x2 = s.nextInt();
	    System.out.println("Value of x2:"+x2);
	    int x3 = s.nextInt();
	    System.out.println("Value of x3:"+x3);
	    int x4 = s.nextInt();
	    System.out.println("Value of x4:"+x4);
	    int x5 = s.nextInt();
	    System.out.println("Value of x5:"+x5);
	    int x6 = s.nextInt();
	    System.out.println("Value of x6:"+x6);
	    Assignment_Day6 obj= new Assignment_Day6();
	    y = obj.sum(x1,x2);
	    y=obj.sum(y, x3);
	    y=obj.sub(y, x4);
	    y=obj.mul(y, x5);
	    y=obj.div(y, x6);
	    System.out.println("Result of (((((x1+x2)+x3)-x4)*x5)/x6):"+y);
	  }
	
	}
	


