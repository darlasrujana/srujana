/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class naturalnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 	  int i, sum = 0;
  	      Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          for(i=1;i<= n;++i)
          {
              sum=sum+i; 
          }

          System.out.println(sum);
	}
}
