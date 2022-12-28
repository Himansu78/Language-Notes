//WAP to demonstrate the use of fgetc() function in file.
#include<stdio.h>
int main()
{
	FILE *fp;
	int ch; char str[90];
	fp = fopen("C:/Users/chiku/chiku.txt","r");
	if(fp==NULL)
	{
		printf("The file couldn't be opened!");
		exit(1);
	}
	int i=0;
	while( (ch=(fgetc(fp))) != EOF)
	{
	str[i] = (char)ch;
	i++;
    }
    str[i]='\0';
    printf("%s",str);
    fclose(fp);
    return 0;
}
