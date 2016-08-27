package harini;

import java.util.Scanner;

public class Harini 
{
    public static void main(String[] args) 
    {
        String str;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    //System.out.println(i);
                    if((i+1)==j)
                    {
                        //System.out.println(i);
                        //System.out.println(j);
                        String s1,s2;
                        s1=str.substring(0,j);
                        //System.out.println(s1);
                        s2=str.substring(j);
                        s2="*"+s2;
                        //System.out.println(s2);
                        str=s1.concat(s2);
                        //System.out.println(str);
                    }
                    else
                        continue;
                }
                
            }
        }
        System.out.println(str);
    }
    
}
