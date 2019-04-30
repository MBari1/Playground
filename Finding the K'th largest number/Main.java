import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
  int k=sc.nextInt();
  int min,h,temp,flag;
  for(int i=0;i<n-1;i++)
  {
    min=a[i];
    h=i;
    flag=0;
    for(int j=i+1;j<n;j++)
    {
      if(a[j]<min)
      {  
        min=a[j];
        h=j;
        flag=1;
      }
    }
    if(flag==1)
    {
    temp=min;
    a[h]=a[i];
    a[i]=temp;
    }
  }
  System.out.println(a[n-k]);
}
}
