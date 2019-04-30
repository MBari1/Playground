import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      String str1=sc.next();
      String str2=sc.next();
      str1=str1+str1;
      int flag=0,h=0;
      for(int i=0;i<str1.length();i++)
      {
        h=i;
        flag=0;
        for(int j=0;j<str2.length();j++)
        {
          if(h<str1.length() && str1.charAt(h)==str2.charAt(j))
            h++;
          else 
          {
            flag=1;
            break;
          }
        }
        if(flag==0)
          break;
      }
      if(flag==0)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}