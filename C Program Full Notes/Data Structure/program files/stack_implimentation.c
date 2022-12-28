//WAP to implement the logic of stack in a program.
#include<stdio.h>
#define CAPACITY 5
void push(int);
int isFull(void);
int pop(void);
int peep(void);
int isEmpty(void);
int stack[CAPACITY], top = -1 ;
int main()
{
	int item,element,val;
	while(1)
	{
		printf("1-PUSH");
		printf("2-POP");
		printf("3-PEEP");
		printf("4-TRAVERSE");
		printf("5-EXIT");
		printf("********************");
		printf("Enter your option: ");
		scanf("%d",&item);
		
		switch(item)
		{
			case 1:
				printf("Enter the element");
				scanf("%d",&element);
				push(element);
				break;
			case 2:
				val=pop();
				if(val==0)
				printf("Stack UNDERFLOW");
				else{
					printf("Element is popped!");
				}
				break;
			case 3:
				val=peep();
				if(val=0)
				{
				    printf("Stack UNDERFLOW");
				}
				else
				{
					printf("Element is Popped!");
				}
				break;
			case 4:
				traverse();
				break;
			case 5:
				exit(0);
			default: 
				printf("Enter an valid option!");
				break;
		}
	}
}
void push(int item)
{
	if(isFull())
	{
		printf("Stack is OVERFLOW!");
	}
	else
	{
		top++;
		stack[top]=item;
		printf("%d is Pushed Successfully");
	}
}
int isFull()
{
	if(top == CAPACITY-1)
	{
		return 1;
	}
	else
	return 0;
}
int pop()
{
	if(isEmpty())
	{
		return 0;
	}
	else{
		return stack[top--];
	}
}

int peep()
{
	if(isEmpty())
	{
	    return 0;	
	}
	else{
		return stack[top];
	}
}

void traverse()
{
	if(isEmpty())
	{
		printf("Stack UNDERFLOW!");
	}
	else
	{
		int i;
		printf("Elements in Stack: ");
		for(i=0;i<=top;i++)
		{
			printf("\n%d",stack[i]);
		}
	}
}

int isEmpty()
{
	if(top == -1)
	{
		return 1;
	}
	else{
		return 0;
	}
}
