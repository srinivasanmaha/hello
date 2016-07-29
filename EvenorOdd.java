import java.util.Scanner;
class Posneg
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Integer x;
		System.out.println("Enter the number");
		x=in.nextInt();
		if(x%2==0)
			System.out.println("the number"+" "+x+"is even");
		else
			System.out.println("the number"+" "+x+"is odd");
	}
}
