import java.util.Scanner;
class Number{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a:");
        int a=sc.nextInt();
		System.out.println("enter b:");
	    int b=sc.nextInt();
		System.out.println("enter c:");
        int c=sc.nextInt();
        if(a<b && a<c){
			System.out.println("First no. is the smallest no.");
		}			
		else{
			System.out.println("First no. is not the smallest no.");
		}
	}
}