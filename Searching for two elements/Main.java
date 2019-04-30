import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int s1=sc.nextInt();
      int s2=sc.nextInt();
      int x=-1,y=-1;
      for(int i=0;i<n;i++)
      {
        if(s1==a[i])
        {
          x=i;
          break;
        }
      }
      for(int i=0;i<n;i++)
      {
        if(s2==a[i])
        {
          y=i;
          break;
        }
      }
        System.out.println(x);
      System.out.println(y);
    }
}