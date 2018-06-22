package main.java.exercise3;

public class Places {
	public static String[] vowelDelete(String[] places)
	{
		int i=0;String[] replaced = new String[places.length];;
		for(String str:places)
		{
			replaced[i]=str.replaceAll("[aeiouAEIOU]","");
			i++;
		}
		return replaced;
	}
}
