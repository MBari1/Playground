import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc=new Scanner(System.in);
      String S=sc.nextLine();
      int f[]=new int[26];
      for(int i=0;i<S.length();i++)
      {
        if(S.charAt(i)>='A' && S.charAt(i)<='Z')
          f[S.charAt(i)-'A']++;
        else if(S.charAt(i)>='a' && S.charAt(i)<='z')
          f[S.charAt(i)-'a']++;
      }
      for(int i=0;i<26;i++)
        if(f[i]==0)
          System.out.print((char)('a'+i)+" "); 
    }
}