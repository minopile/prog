#include<stdio.h>
#include<conio.h>
#include<dos.h>
#include<stdlib.h>
int  main(){
int count= 50;
clrscr();
while(count--){
    sound(10*random(100));
    delay(75);
    mosound();
    textattr(random(16)+'a');
    cprintf("*");

}
return 0;

}
