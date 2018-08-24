#include <iostream>
#include <string>
using namespace std;
int main(){

string str="11110111";
for(int i=str.length()-1;i>=0;i--){



if(str[i]=='1') str[i]='0';

else{
str[i]='1';
break;
}

}
cout<<"string=="<<str<<endl;


return 0;}