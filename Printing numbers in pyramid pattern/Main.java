import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=1;
      for(int r=1;r<=n;r++)
      {
        for(int c=1;c<=(n-r);c++)
        {
          System.out.print(" ");
        }
        for(int c=1;c<=(2*r-1);c++)
        {
          if(c%2==1)
          {
          System.out.print(k);
            k++;
          }
          else
            System.out.print(" ");
        }
        System.out.println();
      }
	}
}