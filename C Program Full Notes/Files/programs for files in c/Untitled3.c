#include<stdio.h>
int myshow(int*);
void main() 
{ 
   int a=10;
   myshow(&a);
}
int myshow(int *k)
{
	printf("Recieved %d,",*k);
}
