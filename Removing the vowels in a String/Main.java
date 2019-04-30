import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String S=sc.nextLine();
    StringBuilder sb=new StringBuilder(S);
    for(int i=0;i<sb.length();i++)
    {
      if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u')
      {
        sb.deleteCharAt(i);
        i=i-1;
      }
    }
    System.out.println(sb);
  }
}