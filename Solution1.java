import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
private static int lonelyInteger(int[] a) 
	{
                int val=0;
		int count=1;
		String str="";
		int x=a.length;
		for(int i=0;i<x;i++)
		{	
            		for(int j=i+1;j<x;j++)
			{	
                            if(a[i]==a[j])
                            {
				count++;
				for(int k=j;k<x-1;k++)
                                    a[k]=a[k+1];
				x--;
				j=i;
                            }
			}
			str=str+a[i]+"="+count+",";
			count=1;
        	}
		StringTokenizer st=new StringTokenizer(str,",");
		String s[]=new String[str.length()];
		int i=0;
		while(st.hasMoreTokens())
		{
                    s[i]=st.nextToken();
                    i++;
		}
                for(int k=0;k<i;k++)
                {
                    if(s[k].contains("=1"))
                    {
                        val=Integer.parseInt(s[k].substring(0,s[k].indexOf("=")));
                        System.out.println(val);
                    }
                }
		return val;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) 
		{
			a[i] = in.nextInt();
		}
		System.out.println(lonelyInteger(a));
	}
}
