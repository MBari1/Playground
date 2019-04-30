import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      find_primes(n);
	}
  static void find_primes(int n)
  {
    for(int i=2;i<=n;i++)
    { int flag=0;
      for(int j=1;j<=i/2;j++)
      {
        if((j!=1 && i%j==0))
        {
          flag=1;
          break;
        }
      }
     if(flag==0)
       System.out.println(i);
    }
  }
}