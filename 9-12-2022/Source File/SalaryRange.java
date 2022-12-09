/*
Date of Develop	:	09-12-2022
Program Name	:	SalaryRange
Developed by	:	Navaneethakannan
Quiz			:	Find Employee Salary Range
*/
import java.util.Scanner;
class SalaryRange
{
	public static void main (String[]args)
	{
		System.out.println("Select your Salary: ");
		Scanner s=new Scanner (System.in);
		int salary=s.nextInt();
		String status=(salary>=20000)? (salary>70000)? "your salary is High level":"your salary is middle level":"Your salary is low level";
		System.out.println(status);
	}
}
/*
0-20000   						==> Low Level
above 20000 and below 70000		==> Mid Level
above 70000						==>	High Level
*/


