class ExceptionHandingDemo
{

	public static void main(String args[])
	{
		int a,b;
		a=10;
		b=0;
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;

		System.out.println("Addition:" + sub);
		System.out.println("subtraction:" + sub);
		System.out.println("Multiplication:" + mul);

		try
		{
			int div;
			div=a/b;
			System.out.println("Divisiom:" + div);
		}
		catch(Exception e)
		{
			System.out.println("you are not able to divide any number by o This is an exception.");

		}
		System.out.println("I sant to be exception");
	}
}
	