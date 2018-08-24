#include<iostream>
using namespace std;
static int count=0;
void merge(int arr[],int l,int m,int r){
	
int n1=m-l+1;
int n2=r-m;

	int left[n1],right[n2];
	for(int i=0;i<n1;i++){
		left[i]=arr[i+l];
	}
	for(int i=0;i<n2;i++){
		right[i]=arr[m+1+i];
	}
int i=0,j=0,p=l;
	while (i<n1&&j<n2){
		if(left[i]<right[j]){arr[p++]=left[i++];}
	else {arr[p++]=right[j++]; ++count;}
		}
		
		if(i<n1){while(i<n1) arr[p++]=left[i++];}
		if(j<n2){while(j<n2) arr[p++]=right[j++];}
	
	
	}
	
void msort(int arr[],int l,int r){
	if(l<r){
	int m=l+(r-l)/2;
	msort(arr,l,m);
	msort(arr,m+1,r);
	merge(arr,l,m,r);
}
}


int main(){
	
	int arr[]={6,2,4,8,3,5};
	int len=sizeof(arr)/sizeof(int);
	
	msort(arr,0,len-1);
	for(int i=0;i<len;i++)cout<<arr[i]<<" ";
	cout<<endl;
	cout<<"count=="<<count<<endl;
	return 0;
}



