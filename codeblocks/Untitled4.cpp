#include<iostream>
#include<string>
#include<stdlib.h>
int main(){
    int num;
std::cin>>num;
std::cin.ignore(256,'\n');
int arr[3];
std::string str,str2;
std::cin>>str;
for(int i=0;i<num;i++){
std::cin>>str2;
arr[i]=atoi(str2);
}


return 0;}
