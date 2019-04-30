import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String S=sc.nextLine();
    String S1=sc.nextLine();
    int flag=0,count=0;
    for(int i=0;i<=(S.length()-S1.length());i++)
    {
      flag=0;
      for(int j=0;j<S1.length();j++)
      {
        if(S.charAt(i+j)!=S1.charAt(j))
        {
          flag=1;
          break;
        }
      }
      if(flag==0)
        count++;
    }
    System.out.println(count);
  } 
}