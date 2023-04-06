# Sum of consecutive Natural Number 
import java.util.Scanner;
public class Sum2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int s = 0;
    int n = input.nextInt();
    s = (n*(n+1)*(n+n+1))/6;
		System.out.println(s);
	}
}
