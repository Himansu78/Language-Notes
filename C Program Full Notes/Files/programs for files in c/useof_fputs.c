// WAP to demonstrate the use of fputs() function.
#include<stdio.h>
int main()
{
	FILE *fp;
    char feedback[40];
	fp= fopen("C:/Users/chiku/chiku.txt","w");
	if(fp==NULL)
	{
		printf("The could not be opened!"); 
		exit(1);
	}
	
	puts("Give a feedback!");
	gets(feedback);
	fflush(stdin);
	fputs(feedback,fp);
	
	printf("%s",feedback);
	
	fclose(fp);
	return 0;
}
