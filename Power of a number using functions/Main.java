import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int e=sc.nextInt();
    int ans=find_pow(b,e);
    System.out.println(ans);
  }
  static int find_pow(int b,int e)
  {
    int pro=1;
    while(e!=0)
    {
      pro=pro*b;
      e--;
    }
    return pro;
  }
}