import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sc=new Scanner(System.in);
      String S=sc.nextLine();
      String S1=sc.next();
      String S2=sc.next();
      String S3=S.replace(S1,S2);
      System.out.println(S3);
    }
}