import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int f[]=new int[n+1];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
        if(f[arr[i]]==0)
          f[arr[i]]=1;
      }
      for(int i=1;i<=n;i++)
      {
        if(f[i]==0)
        {
          System.out.println(i);
          break;
        }
      }
    }
}