#include<stdio.h>
#define action(a,b) a##b+a*b
int main()
{
printf("%d",action(3,4));
return 0;
}
