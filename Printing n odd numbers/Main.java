#include <stdio.h>
int main() {
	//Type your code
  int num,count=0,i=0;
  scanf("%d",&num);
  
 while(count<num){
    if(i%2!=0){
  		printf("%d\n",i);
       count++;
    }
  i++;
   
 }
	return 0;
}