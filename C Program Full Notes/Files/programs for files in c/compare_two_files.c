// No.4 WAP to compare two files to check whether they are identical or not.
#include<stdio.h>
int main()
{
	FILE *fp1,*fp2;
	int ch1,ch2;
	char fname1[30],fname2[30];
	printf("Enter the name of first file:");
	gets(fname1);
	printf("Enter the name of second file:");
	gets(fname2);
	fflush(stdin);
	if((fp1=fopen(fname1,"r"))==NULL)
	{
		printf("First file opening error!");
		exit(1);
	}
	if((fp2=fopen(fname2,"r"))==NULL)
	{
		printf("Second file opening error!");
		exit(1);
	}
	ch1 = fgetc(fp1);
	ch2 = fgetc(fp2);
	while(feof(fp1)==0 && feof(fp2)==0 && ch1==ch2)
	{
		ch1 = fgetc(fp1);
		ch2 = fgetc(fp2);
	}
	if(ch1 == ch2)
	printf("Files are Identical");
	else
	printf("Files are not Identical");
	fclose(fp1);
	fclose(fp2);
	return 0;
}
