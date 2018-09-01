/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class count32
{
	  public static void main (String[] args) throws java.lang.Exception
	  {
		    Scanner sc=new Scanner(System.in);
		    String str=sc.nextLine();
		    int count=1;
		    for(int j=1;j<str.length();j++)
		    {
			      if(str.charAt(j)==' ')
			      {
				        count++;
			      }
		    }
			  System.out.println(count);
	  }
}
