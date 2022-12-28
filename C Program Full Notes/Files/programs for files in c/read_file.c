// WAP to read a file character by character, and display it simultaneously on the screen.
#include<stdio.h>
int main()
{
	FILE *fp;
	char file[40]; int ch,i=0;
	fp = fopen("c:/users/chiku/sonu.txt","w");
	if(fp == NULL)
	{
		printf("The file could not be opened!");
		exit(1);
	}
	while((ch=fgetc(fp)) != EOF)
	{
		file[i]= (char)ch;
		i++;
	 } 
	 file[i]='\0';
	 printf("%s",file);
	 return 0;
}
