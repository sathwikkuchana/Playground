#include <stdio.h>
void insert(int);
void search(int,int);
struct node
{
  	int data;
  	struct node *next;
};
struct node *head =NULL;
int main()
{
   	int size;
 	scanf("%d",&size);
  	for(int i=0;i<size;i++)
    {
      	int ele;
      	scanf("%d",&ele);
      	insert(ele);
    }
  	int n;
  	scanf("%d",&n);
  	if(n>size)
    {
      	printf("No node found");
    }
  	else
    	search(n,size);
   return 0;
}
void insert(int ele)
{
  	if(head ==NULL)
    {
      	head = (struct node*)malloc(sizeof(struct node));
      	head->data = ele;
      	head->next = NULL;
    }
  	else
    {
      	struct node *temp =  (struct node*)malloc(sizeof(struct node));
      	temp->data = ele;
      	temp->next = head;
      	head = temp;
      	
    }
}

void search(int n,int size)
{
  	int x = size-n;
  	struct node *temp = head;
  	for(int i = 0;i<x;i++)
    {
      	temp = temp->next;
    }
  	printf("%d",temp->data);
}