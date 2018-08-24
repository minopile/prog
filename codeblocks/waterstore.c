#include<stdio.h>
#include"quick.h"
int main(){
int arr[]={13,12,11,10,9,8,7,6,5,4,3,2,1};
quicksort(arr,0,12);
int i;for(i=0;i<13;i++)
printf("%d  ",arr[i]);
return 0;
}
