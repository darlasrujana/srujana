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
            System.out.println("positive");
        }
        else if(number < 0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("zero");
        }
	}
}
