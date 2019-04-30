import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int max=a[0];
    for(int i=1;i<n;i++)
    {
      if(a[i]>a[i-1])
        max=max+a[i];
      else
        max=a[i];
    }
    System.out.println(max);
  }
}