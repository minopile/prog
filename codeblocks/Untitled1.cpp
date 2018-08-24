#include<iostream>
#include<string>
using namespace std;
int main(){
cout<<"enter number ";
int  val;
cin>>val;
cin.ignore(32767,'\n');
cout<<"enter name ";
std::string name;
getline(cin,name);
cout<<"this is "<<name.length();
return 0;
}
