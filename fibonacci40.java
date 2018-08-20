/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class fibonacci40
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,a=1,b=1,temp=1;
		Scanner scan=new Scanner(System.in);
		System.out.print(" ");
		n=scan.nextInt();
		System.out.print(" ");
		for(int i=1;i<=n;i++)
		{
            		a=b;
            		b=temp;
            		temp=a+b;
            		System.out.print(a+" ");
		}
	}
}
