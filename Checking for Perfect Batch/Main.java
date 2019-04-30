import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int l[]=new int[n],flag=0,check=0;
    int sum[]=new int[n/3];
    for(int i=0;i<n;i++)
    {
      l[i]=sc.nextInt();
      sum[i/3]=sum[i/3]+l[i];
    }
    check=sum[0];
    for(int i=1;i<n/3;i++)
    {
      if(sum[i]!=check)
      {
        flag=1;
        break;
      }
    }
    if(flag==0)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}