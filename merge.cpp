#include<iostream>
using namespace std;
int main(){
int arr[]={0,0,1,0,1,1,0,1,1,1,1,0,1,1,0,1,0,1};
int len=sizeof(arr)/sizeof(int);
	
	int i=0,j=len-1;
	while(i<j){
		if(arr[i]==0) i++;
		if(arr[j]==1) j--;
		if(arr[i]==1&&arr[j]==0) {arr[i]=0;arr[j]=1;}
	}
	for(int i=0;i<len;i++) cout<<arr[i]<<" ";
	return 0;
}