#include <stdio.h>
int pal(int,int [],int);
int count = 0;
int main()
{
	int test;
  	scanf("%d",&test);
  	for(int i=0;i<test;i++)
    {
    	int n;
      	scanf("%d",&n);
      	int arr[n];
      	for(int i=0;i<n;i++)
        {
          	scanf("%d",&arr[i]);
        }
      	count = 0;
      	int x = pal(0,arr,n);
      	printf("%d\n",x);
    }
   return 0;
}

int pal(int i,int arr[],int n)
{
  	
  	if(i>n-1)
      	return count;
  	if(arr[i]==arr[n-1])
    	pal(i+1,arr,n-1);
  	else if(arr[i]<arr[n-1])
    {
      		arr[i+1] = arr[i]+arr[i+1];
      		count++;
      		pal(i+1,arr,n);
    }
  	else
    {
      		arr[n-2] = arr[n-2]+arr[n-1];
      		count++;
      		pal(i,arr,n-1);
    }
}