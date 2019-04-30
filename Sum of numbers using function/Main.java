import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=find_sum(n);
      System.out.println(sum);
	}
  static int find_sum(int n)
  {
    int sum=0;
    while(n!=0)
    {
      sum=sum+n;
      n--;
    }
    return sum;
  }
}