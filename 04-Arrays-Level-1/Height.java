import java.util.*;
class Height{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		double heights[]= new double[11];
		double sum=0.0;
		System.out.println("Enter the height of 11 football players:");
		for(int i=0;i<11;i++){
			heights[i]= sc.nextDouble();
		}
		for(int i=0;i<11;i++){
			sum+= heights[i];
		}
		System.out.println(sum);
		double mean = sum/11;
		System.out.println("mean height of the football team is: "+ mean);
	}
}