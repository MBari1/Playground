import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=n%10,r1=0;
      int k=0,sum=0;
      while(n!=0)
      {
        r1=n%10;
        sum=sum*10+r1;
        n=n/10;
      }
      k=sum%10;
      System.out.println(r+k);
	}
}