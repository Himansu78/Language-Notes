//WAP to pass structure into function.
struct st{
	char name[20];
	float price;
	int q;
};
float mult(struct st stock);
#include<stdio.h>
void main()
{
	float p,value;
	int i;
	struct st item={"abcd",30.67,45};
	value = mult(item);
	printf("Value ofitem is %f",value);
}
float mult(struct st stock)
{
	float v;
	v = stock.price * stock.q;
	return v;
}
