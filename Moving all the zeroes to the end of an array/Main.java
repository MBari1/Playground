import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int p[]=new int[n],p1=0;
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
        if(a[i]!=0)
          p[p1++]=a[i];
      }
      for(int i=0;i<p1;i++)
      {
        a[i]=p[i];
      }
      for(int i=0;i<n-p1;i++)
      {
        a[p1+i]=0;
      }
      for(int i=0;i<n;i++)
      {
        if(i==(n-1))
          System.out.print(a[i]);
        else
          System.out.print(a[i]+" ");
      }
    }
}