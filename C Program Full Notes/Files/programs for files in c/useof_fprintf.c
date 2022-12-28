// WAP to demonstrate the use of fprintf() function.
#include<stdio.h>
int main()
{
	FILE *fp;
	int i; char name[20];
	float salary;
	fp= fopen("C:/Users/chiku/chiku.txt","w");
	if(fp==NULL)
	{
		printf("The could not be opened!"); 
		exit(1);
	}
	
	for(i=0;i<10;i++)
	{
		puts("\nEnter your name: ");
		gets(name);
		fflush(stdin);
		puts("\nEnter your salary: ");
		scanf("%f",&salary);
		fprintf(fp,"%d Name %s \t salary %f",i,name,salary);
	}
	fclose(fp);
	
	return 0;
}
