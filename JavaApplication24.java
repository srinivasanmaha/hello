package javaapplication24;

import java.util.Scanner;

public class JavaApplication24 
{
    public static void main(String[] args) 
    {
        String str;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        StringBuffer sb=new StringBuffer(str);
        str=sb.reverse().toString();
        System.out.println(str);
    }
    
}
