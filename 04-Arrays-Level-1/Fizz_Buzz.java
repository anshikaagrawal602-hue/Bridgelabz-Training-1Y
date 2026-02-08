import java.util.*;
class Fizz_Buzz{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int num= sc.nextInt();
		if(num<0){
			System.out.println("Invalid");
			return;
		}
		String arr[]= new String[num];
		for(int i=0;i<num;i++){
			if(i%3==0 && i%5==0){
				arr[i]= "FizzBuzz";
			}
			else if(i%3==0){
				arr[i]="Fizz";
			}
			else if(i%5==0){
				arr[i]="Buzz";
			}
			else{
				arr[i]= String.valueOf(i);
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
			
			