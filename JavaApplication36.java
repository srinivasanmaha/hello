/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Srinivasan
 */
public class JavaApplication36 {

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
        }
        for(int i=0;i<len;i++)
        {
            if((i%2)!=0)
            {
                out=out+str1[i]+" ";
            }
            else
            {
                StringBuffer sb=new StringBuffer(str1[i]);
                str1[i]=sb.reverse().toString();
                out=out+str1[i]+" ";
            }
        }
        System.out.println(out);
    }
    
}
