#include <stdio.h>
#include<string.h>
#include<malloc.h>
void insert(int,long long int);
struct node
{
  	int data;
  	struct node *prev;
  	struct node *next;
};
struct node *head = NULL;
struct node *temp;
int main()
{
  long long int n;
  scanf("%lld",&n);
  int arr[n];
  for(int i= 1;i<=n;i++)
  {
    	insert(i,n);
  }
  char str[10000];
  scanf("%s",str);
  int l = strlen(str);
  	temp = head;
  	int i = 0;
  	while(temp->next!=temp)
    {
      	//if(i!=l)
        
          	if(str[i]=='x')
        	{
          		temp = temp->next;
              	if(i ==l-1)
                  	i = 0;
             	else
                  i++;
        	}
            else
            {
              	struct node *t1;
              	t1 = temp->next;
                temp->prev->next = temp->next;
                temp->next->prev = temp->prev;
              	temp = t1;
              	if(i ==l-1)
                  	i = 0;
             	else
                  i++;

            }	
    }
  	printf("%d",temp->data);
   return 0;
}

void insert(int ele,long long int n)
{
  	if(head == NULL)
    {
      	head = (struct node*)malloc(sizeof(struct node));
      	head->data = ele;
      	head->prev = NULL;
      	head->next = NULL;
    }
  	else if(ele ==n)
    {
      	struct node *t = head;
      	for(int i=2;i<ele;i++)
        {
          	t = t->next;
        }
      	t->next = (struct node*)malloc(sizeof(struct node));
      	t->next->data = ele;
      	t->next->prev = t;
      	t->next->next = head;
      	head->prev = t->next;
    }
  	else
    {
      	struct node *t = head;
      	for(int i=2;i<ele;i++)
        {
          	t = t->next;
        }
      	t->next = (struct node*)malloc(sizeof(struct node));
      	t->next->data = ele;
      	t->next->prev = t;
      	t->next->next = NULL;
    }
}