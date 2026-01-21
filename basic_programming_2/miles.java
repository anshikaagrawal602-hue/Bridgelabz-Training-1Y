import java.util.Scanner;
class miles{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter distance in km:");
		double km=sc.nextDouble();
		double m= km*1.6;
		System.out.println("The distance "+ km + " km " + " in miles " + "is " + m);
	}
}