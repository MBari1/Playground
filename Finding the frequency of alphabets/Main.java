import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String S=sc.next();
      int f[]=new int[26],k=0;
      char dist_charac[]=new char[26];
      for(int i=0;i<S.length();i++)
      {
        if(S.charAt(i)>='A' && S.charAt(i)<='Z')
        { 
          if(f[S.charAt(i)-'A']==0)
             {
              dist_charac[k] = (char)(S.charAt(i)+32);
               k++;
             }
          f[S.charAt(i)-'A']++;
        }
        else if(S.charAt(i)>='a' && S.charAt(i)<='z')
        {
          if(f[S.charAt(i)-'a']==0)
             {
              dist_charac[k] = S.charAt(i);
               k++;
             }
          f[S.charAt(i)-'a']++;
        }
      }
             for(int i=0;i<k;i++)
             {        
             System.out.print(dist_charac[i]);
             System.out.print(f[dist_charac[i]-'a']+" ");
             }
    }
}