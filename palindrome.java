/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=0, b, i;
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		i=n;
		while(n!=0)
		{
			b = n%10;
			a = a*10 + b;
			n = n/10;
		}
		if(i==a)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
