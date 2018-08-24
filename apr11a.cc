//longest increasing sub sequence 
//  O(n^2)
#include <iostream>
#include <string>
using namespace std;


void fun(const int arr[],const int size,int S[],const int i){
	if(i>size-1) return;
	if(i==0) {S[i]=1;return;}
	
	int maxi=0;
	for(int j=i-1;j>=0;j--){
		if(arr[j]<arr[i]) maxi=max(maxi,S[j]);
	}
	S[i]=maxi+1;
	
}

int main(){
	  int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 ,80};
	  int size=sizeof(arr)/sizeof(int);
	  int S[size];
	  int maxi=0;
	  
for(int i=0;i<size;i++){
	S[i]=0;
}	
	  
	  for(int i=0;i<size;i++){
		fun(arr,size,S,i);
	  }
for(int i=0;i<size;i++){
	//cout<<S[i]<<" ";
	if(maxi<S[i]) {cout<<arr[i]<<" ";maxi=S[i];}
}	
	return 0;
}
