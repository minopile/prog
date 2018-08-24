#include<iostream>
#include <string>
#include <vector>
using namespace std;

int main(){
	string str="aabacbebebe";
	int k=3;
	char ch; 
	int for_maxi=0,maxi=-1,j=0;
	vector<int>start;
	vector<int>end;
	vector<char>window;
	vector<char>letter;
	for(int i=0;i<str.length();i++){
		if(letter.size()<k)letter.push_back(ch);
		ch=str[i];
		for(j=0;j<k;j++){if(letter.at(j)==ch) break;}
		//for(int _end=0;_end<k;_end++){end.at()}
		
		if(!j<k) {
		mini=min_element(end.begin(),end.end())-end.begin();
		letter.at(mini)=ch;
		start.at(mini)=i;
		end.at(mini)=i;
		}
		else{
			end.at(j)=i;
		}
		
		for_maxi=min_element(start.begin(),start.end())-start.begin();
		maxi=max(maxi,i-start.at(for_maxi));
	}
	
	cout<<maxi<<endl;
	
}