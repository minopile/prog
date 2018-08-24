#include <iostream>
#include <algorithm>

using namespace std;




int msa(int arr[],int i,int j){
cout<<"i=="<<i<<"j=="<<j<<endl;
if(i==j) return arr[i];
int mid=i+(j-i)/2;
int maxi=-100,maxi2=-1,sum=0;
for(int x=mid;x>=i;i--){
sum=sum+arr[x];
if(sum>maxi) maxi=sum;
}
sum=0;maxi2=-100;
for(int y=mid+1;y<=j;j++){
sum=sum+arr[y];
if(sum>maxi2) maxi2=sum;
}

sum=maxi+maxi2;
int temp=max(msa(arr,i,mid),msa(arr,mid+1,j));
return max(temp,sum);

}

void print(int i,int j){
cout<<"i=="<<i<<" j=="<<j<<endl;
if(i==j) return;
int mid=(i+j)/2;
print(i,mid);
print(mid+1,j);
}


int main(){
int arr[]={1,4,-7,8,-4};//,2,6,8,9,-1,4,3,-15,-4,4};
int s=sizeof(arr)/sizeof(int);
cout<<msa(arr,0,s-1);
print(0,s-1);
return 0;
}