import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String S1=sc.nextLine();
    String S2=sc.nextLine();
    StringBuilder sb1=new StringBuilder(S1);
    for(int j=0;j<S2.length();j++)
    {
       for(int i=0;i<sb1.length();i++)
       {
         if(S2.charAt(j)==sb1.charAt(i))
         {
           sb1.deleteCharAt(i);
           i--;
         }
       }
    }
    System.out.println(sb1);
  }
}