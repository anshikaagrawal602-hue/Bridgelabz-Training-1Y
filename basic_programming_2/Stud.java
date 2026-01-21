import java.util.Scanner;
class Stud{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter pen:");
		int pen=sc.nextInt();
		int s=sc.nextInt();
		System.out.println("enter student:");
		int q=pen/s;
		int rem=pen%s;
		System.out.println("The Pen Per Student is " + q + " and the remaining pen not distributed is "+ rem);
	}
}