#include <stdio.h>
#include<math.h>
int main()
{
   int test;
  scanf("%d\n",&test);
  for(int i=0;i<test;i++)
  {
    	int p,r1,r2,r;
    	int n;
    	r1 = 0;
    	r = 0;
    	scanf("%d %d",&n,&p);
  		while(n)
        {
          	n = n/p;
          	r = r+n;
        }
    	printf("%d\n",r);
  }
  
   return 0;
}
