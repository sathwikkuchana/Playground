#include <iostream>
#include<string>
using namespace std;

int main() 
{
   int lb,ub;
  	scanf("%d\n%d",&lb,&ub);
  	int count = 0;
  	for(int i=lb;i<=ub;i++)
    {
      	string s1 = to_string(i);
      	int l = s1.length();
      	int flag = 0;
      	for(int j = 0;j<l;j++)
        {
          	for(int k = j+1;k<l;k++)
            {
              	if(s1[j]==s1[k])
                {
                  	flag = 1;
                  	break;
                }
                 	
            }
        }
         if(flag ==0)
          	count++;
    }
  	if(count>0)
    	printf("%d",count);
  	else
      	printf("No Unique Number");
    return 0;
}