/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Srinivasan
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str,out="";
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        StringTokenizer st=new StringTokenizer(str," ");
        int len=st.countTokens();
        String[] str1=new String[len];
        for(int i=0;i<len;i++)
        {
            str1[i]=st.nextToken();
            char c=Character.toUpperCase(str1[i].charAt(0));
            StringBuilder myName = new StringBuilder(str1[i]);
            myName.setCharAt(0,c);
            out=out+myName+" ";
        }
        System.out.println(out);
    }
    
}
