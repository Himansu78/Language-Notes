//WAP to copy one file into another. copy multiple character at a time.
#include<stdio.h>
int main()
{
	FILE *fp1,*fp2;
    char file[300];
	fp1 = fopen("C:/users/chiku/chiku2.txt","r");
	if(fp1 == NULL)
	{
		printf("First file opening error!");
		exit(1);
	}
	fp2 = fopen("C:/users/chiku/chiku.txt","w");
	if(fp2 == NULL)
	{
		printf("Second file opening error!");
		exit(1);
	}
	
	
	while((fgets(file,300,fp1))!=NULL)
	fputs(file,fp2);
	fclose(fp1);
	fclose(fp2);
	return 0;
}
