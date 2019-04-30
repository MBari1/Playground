import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String S=sc.next();
    double r=0;
    double s1=0.1;
    int i,flag=0;
    for(i=0;i<S.length();i++)
    {
      if(S.charAt(i)!='.')
      {
        r=r*10+(S.charAt(i)-'0');
      }
      else
      {
        flag=1;
        break;
      }
    }
    if(flag==1)
    {
      for(int j=i+1;j<S.length();j++)
      {
        r=r+((S.charAt(j)-'0')*s1);
        if(j!=S.charAt(S.length()-1))
          s1=s1*0.1;
      }
    }
    System.out.println(r);
  }
}