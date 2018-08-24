#include<stdio.h>
//#include<stdlib.h>
int val[]={10,2,45,23,65};
int cmpfunc(const void* a,const void * b){

return (*(int *)a-*(int *)b);
}


int main(){
int i;
qsort(val,5,sizeof(int),cmpfunc);
for( i=0;i<5;i++)
    printf("%d  ",val[i]);
return 0;
}
