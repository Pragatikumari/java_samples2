package permutation;

import java.util.Scanner;

public class day1 {

	public static void main(String args[])
	{
		String s= new String();
    System.out.println("enter any word");
    Scanner imp = new Scanner(System.in);
    s= imp.next();
    System.out.println("the entered string is "+s);
    
   int l= s.length();
    
    System.out.println("number of chars in s is "+l);
    for(int i=0;i<=l-1; i++ )
    {
	System.out.println(s.charAt(i));
	
		
	}
	}	
}
