package main.java.exercise3;

public class Exceptions {
	public static String NegativeArraySizeChecker()
	{
		try
		{
			int[] arr = new int[-1];
		}
		catch(NegativeArraySizeException e)
		{
			return "Negative array size exception";
		}
		return null;
	}
	
	public static String IndexOutOfBoundsChecker()
	{
		try
		{
			int[] arr = new int[2];
			arr[3]= 4;
		}
		catch(IndexOutOfBoundsException e)
		{
			return "Index out of bounds exception";
		}
		return null;
	}
	
	public static String NullPointerExceptionChecker()
	{
		try
		{
			Object a=null;
			a.toString();
		}
		catch(NullPointerException e)
		{
			return "Null pointer exception";
		}
		return null;
		
	}
}
