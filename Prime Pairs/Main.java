#include <stdio.h>
#include<math.h>
int isprime(int);
int main()
{
   int lb,ub;
  	int arr[1000];
  	scanf("%d\n%d",&lb,&ub);
  	int count = 0;
  	for(int i=lb;i<=ub;i++)
    {
      	int x = isprime(i);
      	if(x==1)
        {
          	arr[count] =i;
          	count++;
        }
    }
  	int count2 = 0;
  	for(int i = 0;i<count;i++)
    {
      	for(int j = i+1;j<count;j++)
        {
          	if(arr[j]-arr[i]==6)
            {
              	count2++;
            }
        }
    }
  	if(count2>0)
     	printf("%d",count2);
  	else
      	printf("No Prime Pairs");
     return 0;
}

int isprime(int n)
{
  	for(int i=2;i<=sqrt(n);i++)
    {
      	if(n%i==0)
        {
          	return 0;
        }
    }
  	return 1;
}