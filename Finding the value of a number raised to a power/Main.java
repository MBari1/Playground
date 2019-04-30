import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      int i=1,p=1;
      while(i<=e)
      {
        p=p*b;
        i++;
      }
      System.out.println(p);
    }
}