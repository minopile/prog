#include <iostream>
#include <string>
#include <vector>
using namespace std;
int main(){
	int arr[]={1,6,5,12};
	int sum=0;
	int size=sizeof(arr)/sizeof(int);
	for (int i=0;i<size;i++) sum=sum+arr[i];
	cout<<"sum=="<<sum<<endl;
	return 0;
}
/*
sdm(int pos,int tempsum,int arr[],int sum,int size){
	if(pos>=size) return 0;
	return min(sdm(pos+1,abs(sum-2*tempsum)),sdm(pos+1,abs(sum-2*(tempsum+arr[pos]))));
	
}

*/