//WAP to illustrate the use of entire structure as argument in function.
struct student{
	int roll;
	char name[8];
	char section;
	float mark;
};
#include<stdio.h>
void display(struct student);
int main()
{
	struct student s1;
	display(s1);
	return 0;
}
void display(struct student s2)
{
	s2.roll=21;
	s2.name="Himansu";
	s2.section='D';
	s2.mark=8.6;
	printf("Roll No. %d",s2.roll);
	printf("Name %s",s2.name);
	printf("Section %c",s2.section);
	printf("Mark secured in cgpa %f",s2.mark);
}
