#include <stdio.h>
#include<string.h>
int main()
{
   char s1[100000];
   char s2[100000];
  scanf("%s",&s1);
  scanf("%s",&s2);
  long int n1,n2;
   n1 = strlen(s1);
   n2 = strlen(s2);
  if(n1 ==0 && n2==0)
  {
    	printf("Anagram");
    	return 0;
  }
  if(n1!=n2)
  {
    	printf("Not anagrams");
    	return 0;
  }
  int flag = 0;
   for(int i=0;i<n2;i++)
   {
     	flag = 0;
     	for(int j=0;j<n1;j++)
        {
          		if(s2[i]==s1[j])
                {
                  	flag = 1;
                  	break;
                }
        }
     	if(flag ==0)
        {
          		printf("Not anagrams");
          		break;
        }
   }
  	if(flag ==1)
    {
      	printf("Anagram");
    } 
   return 0;
}