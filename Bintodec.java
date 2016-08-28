package bintodec;

import java.util.Scanner;

public class Bintodec 
{
    public static void main(String[] args) 
    {
        String str;
        int val=0;
        int j=0;
        Scanner in=new Scanner(System.in);
        str=in.next();
        for(int i=str.length()-1;i>=0;i--,j++)
        {
            char c=str.charAt(i);
            int x=Integer.parseInt(Character.toString(c));
            val=val+(x*(int)Math.pow(2,j));
        }
        System.out.println(val);
    }
    
}
