import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String S=sc.nextLine();
      int flag=0;
      for(int i=0;i<=((S.length()-2)/2);i++)
      {
        if(S.charAt(i)!=S.charAt(S.length()-i-1))
        {
          flag=1;
          break;
        }
      }
      if(flag==0)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}