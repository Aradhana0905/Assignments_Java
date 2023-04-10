package assignment_package;

public class ParentConstructor 
{
	public ParentConstructor ()
	{
		this(8,9,10);
		System.out.println("Parent Default Constructor");
	}
	public ParentConstructor (int a)
	{
		this(8,9);
		System.out.println("Parent 1 Parameterized Constructor");
	}
	public ParentConstructor (int a, int b)
	{
		this();
		System.out.println("Parent 2 Parameterized Constructor");
	}

	public ParentConstructor (int a, int b,int c)
	{
		 
		System.out.println("Parent 3 Parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		
		
		
	}
}
