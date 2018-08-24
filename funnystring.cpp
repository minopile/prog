#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    string str="aababbaa";
    int len=str.length();
	for(int i=0;i<len;i++){
		if(str[i]!=str[len-1-i]) { if(str[i+1]==str[len-1-i]) cout<<i<<endl; else cout<<len-1-i<<endl; break;}
	else if(i==(len-1)) cout<<-1<<endl;
	}
	
	
	
	return 0;
}