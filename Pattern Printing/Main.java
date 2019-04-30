import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int c=sc.nextInt();
      int k=r;
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<i;j++)
        {
          System.out.print(k--);
        }
        k=r;
        for(int j=i;j<c;j++)
        {
          System.out.print(r-i);
        }
        System.out.println();
      }
    }
}