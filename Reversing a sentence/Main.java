import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String S=sc.nextLine();
      StringBuilder sb1=new StringBuilder(S);
      reverse_string(sb1,0,sb1.length());
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      StringBuilder tmp=new StringBuilder("");
      StringBuilder f1=new StringBuilder("");
      for(int i=end_idx-1;i>=start_idx;i--)
        {
            if(sb.charAt(i)!=' ')
                tmp=tmp.append(sb.charAt(i));
            else
            {
                tmp=tmp.reverse();
                f1=f1.append(tmp);
                f1=f1.append(sb.charAt(i));
                tmp=tmp.replace(0, tmp.length(), "");
            }
        }
        tmp=tmp.reverse();
        f1=f1.append(tmp);
        System.out.println(f1);
    }
}