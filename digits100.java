/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class digits100
{
	  public static void main (String[] args) throws java.lang.Exception
	  {
		    Scanner sc=new Scanner(System.in);
		    int n,mul=1;
		    n=sc.nextInt();
		    while(n!=0)
		    {
			      mul=mul*(n%10);
			      n=n/10;
		    }
		    System.out.println(mul);
	  }
}
