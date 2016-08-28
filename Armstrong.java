import java.util.Scanner;
class Armstrongnum
{
	public static void main(String[] args) 
   	{
		int a,b,r,val=0;
		int count=0;
                	Scanner in=new Scanner(System.in);
		System.out.println("Enter the two range a and b");
		a=in.nextInt();
		b=in.nextInt();
		for(int i=a;i<=b;i++)
		{
			int x=i;
			int y=i;
                       		int z=i;
			while(x!=0)
			{
                            			r=x%10;
                            			count=count+1;
                           			 x=x/10;
			}
			while(y!=0)
			{
                            			r=y%10;
                            			val=val+(int)Math.pow(r,count);
                           			 y=y/10;
			}
			if(z==val)
				System.out.println("Armstrong number is"+" "+z);
			val=0;
                        		count=0;
		}
	}
}
				