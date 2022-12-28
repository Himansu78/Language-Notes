//WAP toopen a file using fopen() function
#include<stdio.h>
 main()
{
	int ch;
	FILE *fp;
	fp=fopen("C:/Users/Lenovo/Desktop/Himansu/My project/applanding.html","r");
	if(fp==NULL)
	{
		printf("The file could not be opened!");
	}
	else
	{
	    while((ch=fgetc(fp)) != EOF)
	printf("%c",ch);	
	}
}
