#include <iostream>
#include <string>
#include <vector>
using namespace std;

void leave(char ch,int current[]){
current[ch]--;	
}

void collect1(vector<char>&collect,char ch,int need[],vector<char>&small){
	collect.push_back(ch);
	need[ch]--;
	if(need[ch]==0){
		for(int i=0;i<small.size();i++){
		if(small.at(i)==ch) small.erase(small.begin()+i);
		}
	}
}


int main(){
	string str;
	//cin>>str;
	str="lhzeswvvqspiqusovxxlcipxrbssqstedvullyiuespdjpncghkkzbfpvgvelsasqtruqoyomtiuwrpbbzyshanohhsskuskiyyzrlwcmdorxhfcjxexkvuvhlvgddaucbbplvslrzpjmhgqacanngawvvcembskuuarcirbxrldjdlpbojbsgriwaskzunecosnldlhndqzovptyjylcyergauvrtbqkcugnoabaluoescevranugebgvtzrcwctcfzrqgmfpbjnpdqybtsdvobhzbsslojqsyfhoaghrifhtcljcoipautfbjahpklkrhshdyhlcfuecvikwyrqxpxhspxllimlodwtghssqzivhrdjhtycwwaaeuvbejxhacokgyrnqxzncbs";
	
	
	int len=str.length();
	static int ref[256]={0};
	static int current[256]={0};
	static int need[256]={0};
for(int i=0;i<len;i++){
	char ch=str[i];
	ref[ch]++;
}

for(int i=0;i<256;i++){
ref[i]=ref[i]/2;
current[i]=ref[i];
need[i]=ref[i];
}

vector<char>small,strv,collect;
//	for(int i=0;i<len;i++) strv.push_back(str[i]);

int i=0,count=0;
for(int i='a';i<='z';i++){
	if(ref[i]!=0) small.push_back((char)i);
}

for(int i=0;i<len;i++){
	char ch=str[i];
	if(small.at(0)==ch&&need[ch]>0){collect1(collect,ch,need,small);}
	else if(!(small.at(0)==ch)&&!(current[ch]>0)&&need[ch]>0)collect1(collect,ch,need,small);
	else if(!(small.at(0)==ch)&&current[ch]>0) leave(ch,current);

	}

 //for all alphabets with no.of repetations
for(int i=0;i<collect.size();i++){
	cout<<collect.at(i)<<" ";
	}cout<<endl;

	return 0;
}
