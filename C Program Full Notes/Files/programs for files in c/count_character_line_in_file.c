//WAP to count the number of characters an number of lines in a file.
#include<stdio.h>
int main()
{
	FILE *fp;
	int ch,line=0,character=0,i;
	char file[5000];
	fp = fopen("C:/Users/Lenovo/Desktop/My Notes/C Program Full Notes/Files/Full Notes Files in c.docx","r");
	if(fp == NULL)
	{
		printf("The file could not be opened!");
		exit(1);
	}
	else
	printf("The file opened");
	ch=fgetc(fp);
	while(ch!=EOF)
	{
		if(ch=='\n')
		line++;
		character++;
}
	if(character > 0)
	printf("In the file, there are %d lines and %d characters",line,character);
	else
	printf("The file is empty");
	return 0;
}
