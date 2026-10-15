class ExceptionHandalingDemo
{	
	public static void main(String args[])
	{
		int a,b;
		a=10;
		b=0;
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;

		System.out.println("Addition: " + sum);
		System.out.println("Subtraction: " + sub);
		System.out.println("Multiplication: " + mul);

		try
		{
			int div;
			div = a/b;
			System.out.println("Division: " + div);
		}
		catch(Exception e)
		{
			System.out.println("you are not able to divide any number by 0,This is an exception");
		}
		
		System.out.println("I want to be execute");
	}
}