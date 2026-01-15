import java.util.Scanner;
class Harry
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter birth year:");
		int birthYear = sc.nextInt();
		System.out.println("enter current year:");
		int currentYear = sc.nextInt();
		int age = currentYear - birthYear;
		System.out.println("Harry's age in "+ currentYear +" is :" + age);
	}
}	