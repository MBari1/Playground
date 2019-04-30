import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int max=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      if(max<a[i])
      max=a[i];
    }
    int fmax=0;
    int f[]=new int[max+1];
    for(int i=0;i<n;i++)
    {
      f[a[i]]++;
      if(f[a[i]]>fmax)
        fmax=f[a[i]];
    }
    for(int i=0;i<n;i++)
    {
      if(f[a[i]]==fmax)
      {
        System.out.println(a[i]);
        break;
      }
    }
  }
}