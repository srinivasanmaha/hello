import java.util.Scanner;
class Dectobin 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str="";
        int count=0;
        String str1="";
        int quotient=n/2;
        while(quotient!=0)
        {
            int remainder=n%2;
            str=str+remainder;
            n=quotient;
            quotient=quotient/2;
        }
        str=str+"1";	
        StringBuffer strb=new StringBuffer(str);
        str1=(strb.reverse()).toString();
	int out;
out=Integer.parseInt(str1);
System.out.println(out);
        
    }
}
