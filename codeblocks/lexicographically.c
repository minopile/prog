#include<stdio.h>
#include<string.h>
int fact(int );
int lexi(char *);
int position(char * ,int ,int );

int main()
{
    char str="string";
    printf("%d",lexi(str));
    return 0;
}


int fact(int n)
{
    if(n==0)return 1;
    int i,val=1;
    for(i=1; i<=n; i++)
    {
        val=val*i;
    }
}

int position(char * str,int letter,int len)
{
    int i,cot=0 ;
    for(i=0; i<len; i++)
    {
        if(str[letter]>str[i])
            ++cot;
    }
    return cot;
}

int lexi(char* str)
{
    int len=strlen(str);
    int i,output=0;
    for(i=1; i<=len; i++)
    {
        output+=fact(len-i)*(position(str,i-1,len)-1);
    }
}
