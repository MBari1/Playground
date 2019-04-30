import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int r=sc.nextInt();
    for(int i=0;i<r;i++)
    {
      odd_rotate(a,n);
      even_rotate(a,n);
    }
    for(int i=0;i<n;i++)
    {
      if(i==n-1)
        System.out.print(a[i]);
      else
        System.out.print(a[i]+" ");
    }
  	}
  static void even_rotate(int a[],int n)
  {
    int temp=a[1],i;
    for(i=3;i<n;i+=2)
    {
      a[i-2]=a[i];
    }
    a[i-2]=temp;
  }
  static void odd_rotate(int a[],int n)
  {
    int r=0;
    if(n%2==1)
      r=n-1;
    else
      r=n-2;
    int temp=a[r],i;
    for(i=r;i>=2;i-=2)
    {
      a[i]=a[i-2];
    }
    a[0]=temp;
  }
}