import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int max1=greater(n1,n2);
      int max2=greater(n3,max1);
      System.out.println(max2);
	}
  static int greater(int n1,int n2)
  {
    if(n1>n2)
      return n1;
      else
        return n2;
  }
}