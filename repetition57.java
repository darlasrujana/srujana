/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class repetition57
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,n,n1,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		n1=sc.nextInt();
		int []a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==n1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
