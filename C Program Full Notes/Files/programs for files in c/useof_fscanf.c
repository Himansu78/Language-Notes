//WAP to demonstrate the use of fscanf() and fclose().
#include<stdio.h>
int main()
{
	FILE *fp;
	int roll_no; char name[50];
	fp=fopen("C:/Users/chiku/chiku.txt","r");
	if(fp==NULL)
	{
		printf("The file couldn't be opened!");
		exit(1);
	}
	fscanf(fp,"%s %d",name,&roll_no);  //it will take data from file
	printf("\n Name:%s\tRoll No:%d",name,roll_no);
	fclose(fp);
	return 0;
 } 
