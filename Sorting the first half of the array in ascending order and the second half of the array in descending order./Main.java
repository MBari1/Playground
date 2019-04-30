import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),key;
    int a[]=new int[n];
  for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int j;
  for(int i=1;i<n/2;i++)
  {
    key=a[i];
    j=i-1;
    while(j>=0 && a[j]>key)
    {
      a[j+1]=a[j];
      j--;
    }
    a[j+1]=key;
  }
    for(int i=n-2;i>=n/2;i--)
  {
    key=a[i];
    j=i+1;
    while(j<=n-1 && a[j]>key)
    {
      a[j-1]=a[j];
      j++;
    }
    a[j-1]=key;
  }
    for(int i=0;i<n;i++)
    System.out.print(a[i]+" ");
  }
}