class isAlpha
{
	piblic static void main(String[] arg) throws java.io.IOException
	{
		char ch;
		System.out.println("Enetr the character");
		ch=System.in.read();
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			System.out.println(ch+" "+"is an Alphabet");
		else
			System.out.println("ch+" "+"is not an Alphabet");
	}
}