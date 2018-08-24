#include<iostream>
using namespace std;
int abs(int x,int y){return x>y?x-y:y-x;}

bool isEditDistanceOne(string s1,string s2){
if(abs(s1.length(),s2.length())>1) return false;
for(int i=0;i<s1.length();i++){
    if(s1[i]!=s2[i]){
        if(s1.length()>s2.length()){i++;
            if(s1[i]!=s2[i-1]) return false;
        }
        if(s1.length()<s2.length()){i++;
            if(s1[i-1]!=s2[i]) return false;
        }
        if(s1.length()==s2.length()){i++;
            if(s1[i]!=s2[i]) return false;
        }
    }

}   return true;


}

int main()
{

   string s1 ;//= "gfg";
   string s2 ;//= "fgg";
cout<<"hello sairishna";
cin>>s1>>s2;

   isEditDistanceOne(s1, s2)?
           cout << "Yes": cout << "No";


   return 0;
}
