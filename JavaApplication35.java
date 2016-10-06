/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.util.Scanner;

/**
 *
 * @author Srinivasan
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String str;
       Scanner in=new Scanner(System.in);
       str=in.nextLine();
       int len=str.length();
       int x=0;
       for(int i=0;i<len;i++)
       {
           x=x+str.charAt(i);
       }
       char c=(char)(x/len);
       System.out.println(c);
    }
    
}
