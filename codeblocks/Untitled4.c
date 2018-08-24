#include<stdio.h>
int main()
{
int *ptr=(int*)malloc(sizeof(int));
*ptr=12;
//*(ptr+1)=13;
printf("%d",*(ptr));
return 0;
}
