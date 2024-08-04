import java.util.Scanner;
class Power_Recursion {
	public static int pow(int a, int b) {
		if(b==0) return 1;
		return a * pow(a,b-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number 1: ");
		int a = sc.nextInt();
		System.out.print("Enter a number 2 : ");
		int b = sc.nextInt();
		System.out.print(pow(a,b));	
	}
}