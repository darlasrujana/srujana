/* package whatever; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
class power
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     int n=2,p=3,result=1;
       if(n>=0&&p==0)
       {
          result=1;
        }
        else if(n==0&&p>=1)
        { 
           result=0;
         }
         else
         {
            for(int i=1;i<=p;i++)
	          {
                result=result*n;
            }	    
         }
               System.out.println(+result);
	  }
}
