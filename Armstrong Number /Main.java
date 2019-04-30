import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int b=n;
      int A=n;
      int sum=0,pro=1;
      int co=0;
      while(n!=0)
      {
        co++;
        n=n/10;
      }
      while(b!=0)
      {
        int a=co;
        int r=b%10;
        pro=1;
        while(a!=0)
        {
          pro=pro*r;
          a--;
        }
        sum=sum+pro;
        b=b/10;
      }
      if(A==sum)
        System.out.println("Armstrong Number");
      else
         System.out.println("Not a Armstrong Number");
	}
}