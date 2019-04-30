import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int g1=find_gcd(n1,n2);
      int g2=find_gcd(n3,g1);
      System.out.println(g2);
	}
  static int find_gcd(int n1,int n2)
  {
    int temp=0;
    if(n1<n2)
    {
      temp=n1;
      n1=n2;
      n2=temp;
    }
    n1=n1%n2;
    if(n1==0)
      return n2;
    else
      return find_gcd(n1,n2);
  }
}