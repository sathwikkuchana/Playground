#include <iostream>
using namespace std;
int main()
{
   int test;
  	scanf("%d\n",&test);
 	for(int i=0;i<test;i++)
    {
      	string str;
      	getline(cin,str);
      	int l = str.length();
      	//printf("%d",l);
      	char s1[100];
      	int c = 0;
      	int flag;
      	long long int res;
      	long long int b = -1;
      	int n9;
      	for(int j = 0;j<l;j++)
        {
          	string n1 = "";
          	n9 = 0;
          	while(str[j]>='0'&&str[j]<='9')
            {
              	if(str[j]=='9')
                  	n9 = 1;
				n1 = n1+str[j];
              	j++;
            }
          	if(n9!=1&& n1!="")
            {
              		long long int a = stoll(n1);
              		
              		if(a>b)
                    {
                      	res = a;
                      	b = a;
                    }
              
            }
        }
      	printf("%d\n",res);
    }
  	//printf("\n");
 
   return 0;
}