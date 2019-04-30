import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String S=sc.next();
    StringBuilder sb=new StringBuilder("");
    int S_len=S.length();
    sb.append(S.substring(S_len/2));
    sb.append(S.substring(0,S_len/2));
    for(int r=0;r<S_len;r++)
    {
      for(int c=0;c<S_len-r-1;c++)
        System.out.print(" ");
      for(int c=0;c<r+1;c++)
        System.out.print(sb.charAt(c));
      System.out.println();
    }
  }
}