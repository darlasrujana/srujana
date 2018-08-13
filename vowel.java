/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class vowel
{
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner sc=new Scanner(System.in);
	        char ch=sc.next().charAt(0);
		if((ch >='a' && ch <= 'z') ||(ch >='A' &&ch <= 'Z'))
		{
			if(ch== 'a' || ch=='A' || ch== 'e' ||ch== 'E' ||ch== 'i'||ch== 'I'||ch== 'o'||ch== 'O'||ch== 'u'||ch== 'U')
			System.out.println("vowel");
			else
			System.out.println("consonant");
		}
		else
		System.out.println("invalid");	
	}
}
