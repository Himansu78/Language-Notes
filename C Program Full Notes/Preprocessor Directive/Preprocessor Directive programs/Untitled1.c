#include<stdio.h>
int main()
{
	int x;
	struct class{
		int no;
		char name[20];
		float mark;
	};
	struct class s3;
    struct class s1={14,"Himanshu",80.5};
	struct class s2={15,"Himansu",87.5};
	s3=s2;
	if((s2.no==s3.no)&&(s2.mark==s3.mark))
	printf("s2 and s3 are same");
	else
	printf("s2 and s3 are not same");
	
	return 0;
}
