package com.inheritence;
 class Student {
	
	protected String sname,course;
	
	public void getInfo(String sname,String course)
	{
	 this.sname=sname;
	 this.course=course;
	}

}
class Marks extends Student
{
	protected int sub1,sub2;

    public void getMarks(int sub1,int sub2)
    {
    	this.sub1=sub1;
    	this.sub2=sub2;
    }
}
class Results extends Marks
{
	public void PrintResults()
	{
	System.out.println("Name:" +sname );
	System.out.println("student Course:" +course);
	System.out.println("sub1 marks" +sub1);
	System.out.println("sub2 marks" +sub2);
	System.out.println("total marks"  +(sub1+sub2));
	}
	
}

public class StudentMarks{
	public static void main(String[] args) {
		Results result=new Results();
		result.getInfo("veena","Java");
		result.getMarks(70,90);
		result.PrintResults();
		
		
		
	}
}
