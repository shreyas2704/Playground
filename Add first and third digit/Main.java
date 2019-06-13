#include<stdio.h>
int main()
{
  //Type your code here
int num,val1,val2,res;
  scanf("%d",&num);
 val1=(num/100);
 val2= num%10;
 res= val1+val2;
  printf("%d",res);
  return 0;
}