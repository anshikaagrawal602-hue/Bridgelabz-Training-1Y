import java.util.*;
class Multiplication{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int num= sc.nextInt();
		int table[]= new int[4];
		for(int i=6;i<=9;i++){
			table[i-6]= num*i;
		}
		for(int i=6;i<=9;i++){
			System.out.println(num+" * " + i + " = "+ table[i-6]);
		}
	}
}