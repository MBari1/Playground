import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc=new Scanner(System.in);
    StringBuilder temp=new StringBuilder("-");
    int n=sc.nextInt(),flag=0;
    if(n<0)
    {
      n=n*-1;
      flag=1;
    }
    StringBuilder sb=new StringBuilder("");
    while(n!=0)
    {
      sb.append(n%10);
      n=n/10;
    }
    sb.reverse();
    if(flag==1)
    {
      temp.append(sb);
      System.out.println(temp);
    }
    else
    System.out.println(sb);
  }
}