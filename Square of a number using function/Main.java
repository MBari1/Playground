import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=find_square(n);
      System.out.println(a);
	} 
  static int find_square(int n)
  {
    int b=n*n;
    return b;
  }
}