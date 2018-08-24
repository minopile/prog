#include <iostream>
#include <string>
using namespace std;



string twos(string str){
for(int i=str.length();i>=0;i--){
cout<<"i=="<<str[i]<<endl;
if(str[i]=='1'){ 
str[i]='0';
}
else 
{str[i]='1';
break;
//return str;
}

}
return str;
}
/*
string ones(string str){
for(int i =0;i<str.length();i++){
if(str[i]=='0') str[i]='1';
else str[i]='0';
}return str;
}

*/
int main() {
    int t;
    string str;
   
   cin>>str;
   cout<<twos(str)<<endl;
   	return 0;
}
