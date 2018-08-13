/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class positive
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
	        if(number > 0)
        {
            System.out.println("Positive");
        }
        else if(number < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
	}
}
