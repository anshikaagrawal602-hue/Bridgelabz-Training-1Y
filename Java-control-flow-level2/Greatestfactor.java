import java.util.Scanner;
class Greatestfactor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
		int gfactor=1;
			int counter=n;
			while(counter>=1){
				if(n%counter==0){
					gfactor=counter;
					break;
				}
				counter--;
			}
			System.out.println("Greatest Factor of " + n + " are:"+gfactor);
	}
}