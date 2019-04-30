import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      n1 = n1/10;
      int a = n1%10;
      System.out.println(a);
	}
}