import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int val=sc.nextInt();
      for(int i=0;i<=n-2;i++)
      {
        for(int j=i+1;j<=n-1;j++)
        {
          if(a[i]+a[j]==val)
            System.out.println(a[i]+", "+a[j]);
        }
      }
    }
}