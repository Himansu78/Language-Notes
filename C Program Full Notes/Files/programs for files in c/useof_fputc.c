// WAP to demonstrate the use of fputc() function.
#include<stdio.h>
int main()
{
	FILE *fp;
    char feedback[40];
    int ch,i;
	fp= fopen("C:/Users/chiku/chiku.txt","w");
	if(fp==NULL)
	{
		printf("The could not be opened!"); 
		exit(1);
	}
	puts("Give an important feedback!");
	gets(feedback);
	for(i=0;i<feedback[i];i++)
	fputc(feedback[i],fp);
	printf("%s",feedback);
	fclose(fp);
	return 0;
}
