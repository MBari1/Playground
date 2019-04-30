import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int r=1;r<=n;r++)
      {
        for(int c=1;c<=(n-r+1);c++)
        {
          System.out.print(n-c-r+2);
        }
        System.out.println();
      }
	}
}