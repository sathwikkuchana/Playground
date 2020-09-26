#include <stdio.h>
int main()
{
  	int test;
  	scanf("%d",&test);
  	for(int i=0;i<test;i++)
    {
      	int n;
      	scanf("%d",&n);
      	if(n==1||n==10||n==20||n==100||n==200||n==1000||n==2000)
        {
          printf("Yes");
        }
      	else if(n%10==0&&(n==1||n==10||n==20||n==100||n==200||n==400||n==2000||n==10000||n==20000||n==40000))
        {
          	 printf("Yes");
        }
      	else
        {
          	
              	printf("No");
          	 
        }
      	 printf("\n");
    }
   return 0;
}
