/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author Srinivasan
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str,str1="";
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        str=str.toUpperCase();
        for(char ch='A';ch<='Z';ch++)
        {
            if(str.contains(""+ch))
            {
                str1="Panagram";
            }
            else
                str1="Not a panagram";
        }
        System.out.println(str1);
    }
    
}
