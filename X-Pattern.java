# X-Pattern
public class Pattern5
{
	public static void main(String[] args) {
	int n= 5;
	int m = 5;
	for(int i = 1;i<=n;i++){
	   /* for(int j=1;j<=(n-i);j++){
	        System.out.print(" ");
	    }
	    */
	    for(int j = 1 ; j<=m; j++){
	       
	        if(j==i||j+i==6)
	         System.out.print("*");
	         else
	          System.out.print(" ");
	    }
	    
	    System.out.println();
	 }

  }
}
