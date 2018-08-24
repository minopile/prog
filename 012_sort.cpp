#include<iostream>
using namespace std;
int main(){
int arr[]={0,2,0,2};
int len=sizeof(arr)/sizeof(int);
int i=0,j=len-1,k=len-1;
/*
or with j =0 and {<j++> <j++> < >}
*/
while(i<j){
	if(arr[j]==0){swap(arr[i],arr[j]);i++;}
	if(arr[j]==1) j--;
    if(arr[j]==2) {swap(arr[j],arr[k]);k--;j--;}
	
}


for(int i=0;i<len;i++) cout<<arr[i]<<" ";
	
return 0;
}