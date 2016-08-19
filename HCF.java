import java.util.Scanner;
class HcfLcm
{
	public static void main(String[] arg)
	{
		Integer a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the two  numbers");
		a=in.nextInt();
		b=in.nextInt();
		int h=1;
		int p=a*b;
		for(int i=2;i<p;i++)
		{
			if((a%i==0)&&(b%i==0))
				h=i;
		}
		
		System.out.println("The Hcf of"+" "+a+" "+"&"+" "+b+" "+"is"+h);
		
	}
}
		