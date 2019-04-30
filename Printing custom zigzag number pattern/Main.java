import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int r=1;r<=n;r++)
      {
        for(int c=1;c<=n;c++)
        {
          if(r%2==1)
          {
            if(c==n)
              System.out.print(r+1);
            else
              System.out.print(r);
          }
          else
          {
            if(c==1)
              System.out.print(r+1);
            else
              System.out.print(r);
          }
        }
        System.out.println();
      }
	}
}