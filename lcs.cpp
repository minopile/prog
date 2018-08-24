#include<iostream>
#include<string>
using namespace std;
int j;

int LCS(string x,string y,int xl,int yl){
	int L[xl+1][yl+1],maxi=0;
for(int i=0;i<=xl;i++){
	for(j=0;j<=yl;j++){
		if(i==0||j==0) L[i][j]=0;
		else if(x[i-1]==y[j-1]) {
			L[i][j]=1+L[i-1][j-1]; 
		maxi=max(maxi,L[i][j]);}
		else L[i][j]=0;
			
	}
	
	}

	return maxi;
	
	}


	/*
	

int LCS(string X, string Y, int m, int n)
{
 
    for (int i=0; i<=m; i++)
    {
        for (int j=0; j<=n; j++)
        {
            if (i == 0 || j == 0)
                LCSuff[i][j] = 0;
 
            else if (X[i-1] == Y[j-1])
            {
                LCSuff[i][j] = LCSuff[i-1][j-1] + 1;
                result = max(result, LCSuff[i][j]);
            }
            else LCSuff[i][j] = 0;
        }
    }
    return result;
}
*/


int main(){
	string x,y;
	x="everybody";
	y="somedogdays";
	int xl,yl;
	xl=x.length();
	yl=y.length();
	int len=LCS(x,y,xl,yl);
	cout<<"LCS== "<<len<<endl;
		
	return 0;
}
