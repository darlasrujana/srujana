/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prime66
{
	 public static void main (String[] args) throws java.lang.Exception
	 {
		     int num ;
         boolean flag=false;
         Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
         for(int i=2; i<=num/2;++i)
         {
             if(num % i == 0)
             {
                 flag = true;
                 break;
             }
         }
         if (!flag)
             System.out.println("yes");
         else
             System.out.println("no");
	  }
}
