/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arithmetic21
{
	 public static void main (String[] args) throws java.lang.Exception
	 {
	     int n,a,d;
		   Scanner s=new Scanner(System.in);
		   n=s.nextInt();
		   a=s.nextInt();
		   d=s.nextInt();
		   System.out.println(n*(2*a+(n-1)*d)/2);
	 }
}
