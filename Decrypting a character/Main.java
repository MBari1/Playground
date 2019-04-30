import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char c=sc.next().charAt(0);
      int k=sc.nextInt();
      if(c>='a' && c<='z')
      {
        if((char)c-k>='a')
          c=(char)(c-k);
        else
          c=(char)(c+26-k);
      }
     else if(c>='A' && c<='Z')
      {
        if((char)c-k>='A')
          c=(char)(c-k);
        else
          c=(char)(c+26-k);
      }
      System.out.println(c);
    }
}