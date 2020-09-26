#include <stdio.h>
#include<string.h>
int main()
{
  	char arr[10000];
  	scanf("%s\n",&arr);
  	
  	int len = strlen(arr);
  	
  	int n;
  	scanf("%d\n",&n);
  	
  	char dir;
  	scanf("%c",&dir);
  	if(n==0||n==len)
    {
      	printf("%s\n",arr);
      	return 0;
    }
  	if(n>len)
    {
      	n = n%len;
    }
  	
  
  	if(dir=='L')
    {
      		
    		for(int i = n;i<len;i++)
            {
              		printf("%c",arr[i]);
            }
      		for(int i=0;i<=n-1;i++)
            {
              		printf("%c",arr[i]);
            }
    }
  	else if(dir =='R')
    {
      		for(int i =len-n;i<len;i++)
            {
              		printf("%c",arr[i]);
            }
      		for(int i=0;i<=len-n-1;i++)
            {
              		printf("%c",arr[i]);
            }
    }
  	else
      return 0;
  	
  	
}