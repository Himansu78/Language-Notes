#include<stdio.h>
int main()
{
	int a[5],i,*pt;
	
	printf("Enter");
	for(i=0;i<5;i++)
	scanf("%d",&a[i]);
	
	printf("ARRAY");
	pt=a;
	for(i=0;i<5;i++)
	{
		printf("%d",*pt);
		pt++;
	}
	return 0;
}
