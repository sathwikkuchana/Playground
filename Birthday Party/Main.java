#include <stdio.h>
#include <math.h>
int main()
{
   int test;
  	scanf("%d",&test);
  	long long int x = pow(10,9)+7;
  	for(int i=0;i<test;i++)
    {
      		long long int n;
      		scanf("%lld",&n);
      		n = n*(2*n-1);
      		n = n%x;
      		printf("%lld\n",n);
      		
    }
   return 0;
}