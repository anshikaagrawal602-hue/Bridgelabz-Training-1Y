import java .util.Scanner;
class PL
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter cost price:");
		int cp=sc.nextInt();
		System.out.println("enter selling price:");
		int sp = sc.nextInt();
		int profit = sp-cp;
		int profit_percent = (profit*100)/cp;
		System.out.println("The Cost Price is INR is "+ profit+ " and Selling Price is INR is "+profit_percent);
		System.out.println(profit_percent);
	}
}