import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int b=n;
      int A=n;
      int sum=0,pro=1;
      int c0=0;
      int a=c0;
      while(n!=0)
      {
        c0++;
        n=n/10;
      }
      while(b!=0)
      {
        int r=b%10;
        pro=1;
        while(r!=1)
        {
          pro=pro*r;
          r--;
        }
        sum=sum+pro;
        b=b/10;
      }
      if(A==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}