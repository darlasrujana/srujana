/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class bitwise38
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		a=a^b; 
		b=a^b; 
		a=a^b; 
		System.out.print(" "+a);
		System.out.print(" "+b);
	}
}
