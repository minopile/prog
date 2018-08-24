#include<stdio.h>
#include<stdlib.h>
int cmpfunc(const void *a ,const void *b)
{
    return (*(int *)a-*(int *)b);
}

int main()
{
    int k=16;
    int i,j,l,r,vl,vr;
    int A[] = {1, 4, 45, 6, 10, -8};
    qsort(A,6,sizeof(int),cmpfunc);
    l=0;
    r=5;
    for(i=0; i<6; i++){
        if((A[l]+A[r])==k)
        {
            vl=A[l];
            vr=A[r];
        }
    if(A[l]+A[r]>k)
        r--;
    if(A[l]+A[r]<k)
        l++;}
    printf("%d %d",vl,vr);
    return 0;
}


