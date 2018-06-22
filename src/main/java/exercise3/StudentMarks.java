package main.java.exercise3;

public class StudentMarks {
	public static String[] check(int grade[])
	{
		int i = 0,len=grade.length;
		String[] gradeStatus = new String[len];
		for(int e:grade)
		{
			if(e>100||e<0)
			{
				gradeStatus[i]="False";
			}
			else
			{
				gradeStatus[i]="True";
			}
			i++;
		}
		return gradeStatus;
	}

}
