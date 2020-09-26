#include <stdio.h>
#include<math.h>
int divide(int ,int);
int isugly(int);
int count = 1;
int main()
{
   	int test;
  	scanf("%d",&test);
  	for(int i=0;i<test;i++)
    {
      		int n;
      		scanf("%d",&n);
      		count = 1;
      		if(n==1)
            {
              		printf("1\n");
  
            }
      		else
            {
                int j= 2;

                while(count<n)
                {
                        int x = isugly(j);
                        if(x==1)
                            count++;
                        j++;
                }
      			printf("%d\n",j-1);
            }
    }
   return 0;
}

int isugly(int n)
{
  	n = divide(n,2);
  	n = divide(n,3);
  	n = divide(n,5);
  	if(n==1)
      	return 1;
  	else
      	return 0;
}

int divide(int a,int b)
{
  		while(a%b==0)
        {
          	a = a/b;
        }
  		return a;
}