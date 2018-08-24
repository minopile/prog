#include<stdio.h>
int main(){
    int A[]={1,2,5,-7,2,5};
    int n1=6;
   int i,j,k=0,p,k1,k2;
   int summax=0,start=0;
   int sum[6]={0};
   int ret[6]={0};
   j=0;
   for(i=0;i<n1;i++){
    if(A[i]>=0) {sum[j]+=A[i];k++;}
    else {if(A[i+1]>=0) j++;k1=k;k=0;}
   if(summax<sum[j]){summax=sum[j-1];
     start=k1;
     k2=i;
     }
   }

printf("%d",start);
//for(i=)

return 0;
}
