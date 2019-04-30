import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String S=sc.nextLine();
    String W[]=S.split(" ");
    for(int i=0;i<W.length-1;i++)
    {
      if(W[i]!=null)
      {
        for(int j=i+1;j<W.length;j++)
        {
          if(W[i].equals(W[j]))
            W[j]=null;
        }
      }
    }
    for(int i=0;i<W.length;i++)
    {
      if(W[i]!=null)
        System.out.print(W[i]+" ");
    }
  }
}