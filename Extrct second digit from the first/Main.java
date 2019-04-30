import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r=0;
    int sum=0;
    while(n!=0)
    {
      r=n%10;
      sum=sum*10+r;
      n=n/10;
    }
    sum=sum/10;
    r=sum%10;
    System.out.println(r);
  }
}