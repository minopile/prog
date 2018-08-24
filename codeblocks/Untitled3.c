#include<string.h>
#include<stdio.h>
int main(){
char const buffer[5000];
int prime[1000],num,i=0;
char *line,*token;
FILE *fp=fopen("primes.txt","r");
line=fgets(buffer,"%s",fp);

token=strtok(buffer,",");

while(token!=NULL){
    prime[i++]=atoi(token);
  //printf("%s\n",token);
  token=strtok(NULL,",");
   }
  int sum=0;
  for(i=0;i<250;i++){
    sum=sum+prime[i];
    printf("%7d\n",sum);
  }

fclose(fp);
return 0;}
