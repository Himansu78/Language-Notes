// WAP to demonstrate the use of fgets() .
#include<stdio.h>
int main()
{
	FILE *fp;
	char str[50];
	fp = fopen("C:/Users/chiku/chiku.txt","r");
	if(fp==NULL)
	{
		printf("The file couldn't be opened!");
		exit(1);
	}
	while(fgets(str,50,fp) != NULL)
	{
		printf("%s ",str); //This file will read 49 character one by one 
	}
	fclose(fp);
	return 0;
}
