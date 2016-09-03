/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subset;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Srinivasan
 */
public class Subset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] a1;
        int[] a2;
        int n1,n2;
        Scanner in=new Scanner(System.in);
        n1=in.nextInt();
        n2=in.nextInt();
        a1=new int[n1];
        a2=new int[n2];
        String s1="",s2="";
        for(int i=0;i<n1;i++)
        {
            a1[i]=in.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            a2[i]=in.nextInt();
        }
        s1=Arrays.toString(a1);
        s2=Arrays.toString(a2);
        //System.out.println(s1);
        //System.out.println(s2);
        if(s2.length()>=s1.length())
        {
            if(s2.contains(s1))
                System.out.println("is a subset");
            else
                System.out.println("is not a subset");
        }
    }
    
}
