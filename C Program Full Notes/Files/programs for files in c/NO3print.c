//No.3 WAP to print the text of a file on screen by printing the text line by line and displaying 
//the line numbers before the text in each line. use command line arguments to enter the filename.
#include<stdio.h>
int main()
{
	FILE *fp;
	char text[200],ch;
    int line=0,i=0;
    
    fp=fopen("C:/Users/chiku/sonu.txt","r");
    if(fp==NULL)
    {
    	printf("File could not be opened");
    	exit(1);
	}
	while(feof(fp) == 0)
	{
		ch=fgetc(fp);
		if(ch=='\n')
		{
			line++;
			text[i] = '\0';
			printf("\n%d %s",line,text);
			i=0;
		}
		text[i] = ch;
		i++;
	}
	text[i] = '\0';
	printf("%s",text);
	fclose(fp);

	return 0;
 } 
