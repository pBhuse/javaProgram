class DataType
{
	public static void main(String args[])
	{
		System.out.println("Welcome to main method ");
		DataType ob = new DataType();
		ob.bytenumber();
		ob.shortNum();
		ob.intNumber();
		ob.longNumber();
		ob.doubleNumber();
		ob.floatNumber();
		ob.booleanNumber();
		ob.charValue();
		
	}
	public void bytenumber()
	{
		Byte num=113;
		System.out.println("Byte Number="+num);
		System.out.println("Size of Byte ="+(Byte.SIZE/8));
		
	}
	public void shortNum()
	{
		Short num1=1238;
		System.out.println("Short Number="+num1);
		System.out.println("Size of Short="+(Short.SIZE/8));
	}
	public void intNumber()
	{
		int num2 = 3455;
		System.out.println("Integer Number="+num2);
		System.out.println("Size of Integer="+(Integer.SIZE/8));
		
	}
	public void longNumber()
	{
		long num3=-12332252626L;
		System.out.println("Long Number="+num3);
		System.out.println("Size of  Long ="+(Long.SIZE/8));
	}
public void doubleNumber()
{
	double num4 = -42937737.9d;
	System.out.println("Double Number="+num4);
		System.out.println("Size of  double="+(Double.SIZE/8));
}
public void floatNumber()
{
	float num5 = 19.98f;
	System.out.println("Float Number="+num5);
		System.out.println("Size of  Float ="+(Float.SIZE/8));
}
public void booleanNumber()
{
	boolean num6=false;
	System.out.println("Boolean Number="+num6);
		//System.out.println("Size of Boolean ="+(Boolean.SIZE/8));// java can not find size of boolean data type because it hold only 1 bit value also their is no Boolean  Wrapper class in java 
}
public void charValue()
{
	char ch='A';
	System.out.println("Character value="+ch);
	System.out.println("Size of Character ="+(Character.SIZE/8));
}
}