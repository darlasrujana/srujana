/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class leapyear
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int year = 2016;
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
