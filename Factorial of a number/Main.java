import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int pro=1;
      while(n!=1)
      {
        pro=pro*n;
        n--;
      }
      System.out.println(pro);
	}
}