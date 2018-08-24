#include<stdio.h>
#include<string.h>
int main(){
char arr[]="helloyellowloll";
char str[]="o";
char *token;
token=strtok(arr,str);
while(token!=NULL){
   // printf("%s  ",token);
    token=strtok(NULL,str);

}
printf("%s",arr);
return 0;
}
