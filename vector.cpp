#include<iostream>
#include<vector>
using namespace std;
int main(){
	vector<int >vec;
	for(int i=0;i<100;i++){
		vec.push_back(i);
	}
	
	vector<int >::iterator it=vec.begin();
	do{
		cout<<*it<<endl;
		it++;
	}
	while(it!=vec.end());
	
return 0;	
}