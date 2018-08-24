//lcs of two srings
//input twostrings
//output length and string

#include<iostream>
#include <string>
#include<vector>
using namespace std;
string x="watermelon",y="waitermonth";


void lcs(int xlen,int ylen){
	int arr[xlen+1][ylen+1];
	int maxi=-1;
	for(int i=0;i<xlen+1;i++){
		for(int j=0;j<ylen+1;j++){
			if(i==0||j==0)arr[i][j]=0;
			
			else if(x[i-1]==y[j-1]){
			arr[i][j]=arr[i-1][j-1]+1;
			if (arr[i][j]>maxi){cout<<x[i-1];maxi=arr[i][j];}
			}
			else arr[i][j]=max(arr[i-1][j],arr[i][j-1]);
		}
	}
	cout<<"lcs=="<<arr[xlen][ylen];
}




int main(){
	int xlen=x.length(),ylen=y.length();
lcs(xlen,ylen);

//for(int i=0;i<vec.size();i++)cout<<vec.at(i);
//	cout<<endl;
	
	return 0;
}

