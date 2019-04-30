import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int max=0,temp=1;
      for(int i=0;i<n-1;i++)
      {
        if(a[i]==1 && a[i+1]==1)
          temp++;
        else
        {
          if(max<temp)
          {
            max=temp;
            temp=1;
          } 
        }
      }
      System.out.println(max);
    }
}