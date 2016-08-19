#include<stdio.h>
#include<conio.h>
void main()
{
char a[25];
char b[10];
int i=0,j=0;
clrscr();
printf("enter the string1");
scanf("%s",a);
printf("enter the string2");
scanf("%s",b);
while(b[j]!='\0')
{
while(a[i]!='\0')
i++;
a[i]=b[j];
i++;
j++;
a[i]='\0';
}
printf("%s",a);
getch();
}