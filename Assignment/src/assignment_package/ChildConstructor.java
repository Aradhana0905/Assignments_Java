package assignment_package;

public class ChildConstructor extends ParentConstructor
{
	public ChildConstructor ()
	{
		this(8,9);
		System.out.println("Child Default Constructor");
	}
	public ChildConstructor (int a)
	
	{ 
		this();
		System.out.println("Child 1 Parameterized Constructor");
	}
	public ChildConstructor (int a, int b)
	
	{
		super(8);
		System.out.println("Child 2 Parameterized Constructor");
	}

	public ChildConstructor (int a, int b,int c)
	{
		this(8);
		System.out.println("Child 3 Parameterized Constructor");
	}

	
	public static void main(String[] args) 
	{
		ChildConstructor obj=new ChildConstructor(8,9,10);
			
	}
}
