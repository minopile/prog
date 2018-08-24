#include <stdio.h>

void add(int (*a)[2])
{//,int b[][2],int c[][2]){
for(int i=0;i<2;i++)
{
    int *p;
    p=(a+i);
    for(int j=0;j<2;j++)
        printf("%d  ",*(p+j));
}
}


int main()
{
    int (*A)[2];///={1,2,3,4};
 for(int j=0;j<20;j++)
        printf("%d\n",*(A+j));

//add(A);

return 0;
}
