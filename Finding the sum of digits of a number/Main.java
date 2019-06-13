#include <stdio.h>
int main() {
	//Type your code
  int num,v1,v2=0;
  scanf("%d",&num);
  //v2=num%10;
  
  while(num!=0){
    v1=num%10;
    v2=v1+v2;
    num=num/10;
  }
  printf("%d",v2);
	return 0;
}