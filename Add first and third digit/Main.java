import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int a = n1%10;
      n1=n1/100;
      int sum = a+n1;
      System.out.println(sum);
	}
}