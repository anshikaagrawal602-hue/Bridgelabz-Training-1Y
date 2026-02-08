import java.util.*;
class Odd_even{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int num= sc.nextInt();
		if(num<0){
			System.out.print("error plz enter a natural number:");
		}
		int size=(num/2)+1;
		int even_arr[]= new int[size];
		int odd_arr[]= new int[size];
		int even_index=0;
		int odd_index=0;
		for(int i=0;i<=num;i++){
			if(i%2==0){
				even_arr[even_index]=i;
				even_index++;
			}
			else{
				odd_arr[odd_index]=i;
				odd_index++;
			}
		}
		System.out.println("Odd Numbers:- ");
        for(int i=0;i<odd_index;i++){
			System.out.println(odd_arr[i]+" ");
		}
        System.out.println("Even Numbers:- ");		
		for(int i=0;i<even_index;i++){
			System.out.println(even_arr[i]+" ");
		}
	}
}