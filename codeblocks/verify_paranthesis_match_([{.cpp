#include<iostream>
#include<stdio.h>
#include<stack>
#include<string>
using namespace std;
int main(){
char *ss="(a+b}*{v+6*(2+[4+8])}";
cout<<ss[4];
//ss[4]='(';
   stack<char >mystack;
    int i=0;
    for(i=0;ss[i]!='\0';i++){
       if(ss[i]=='('||ss[i]=='['||ss[i]=='{')
            mystack.push(ss[i]);
        if(ss[i]==')'||ss[i]==']'||ss[i]=='}')
           if(mystack.empty()||mystack.top()!=ss[i]) break;
       else
           mystack.pop();
    }
    if(mystack.empty()){
        cout<<"all clear";
    }
    else cout<<"un matched";




    return 0;
}
