
#include"stdio.h"
int main()
{
    float time[]=
    {
       /// 0.119,0.319,1.556,1.816,3.008,3.183,4.628,4.770,6.110,6.252,7.796,8.068,9.411,9.580,10.91,11.04
 ///0.718,0.948,2.079,2.249,3.450,3.578,4.270,4.379,4.896,5.148,6.219,6.347,7.523,7.767,8.740,8.193
///0.386,0.531
0.941,1.049,2.715,2.984,4.598,4.874,5.783,5.944,6.614,6.906,8.878,9.012,10.827,11.012,12.919,12.988,14.923,15.001
  };

    int len=sizeof(time)/sizeof(float);
    int i;
    for(i=0; i<len/2; i++)
    {
        printf("%f  %f\n",floor(5*time[2*i]+7.75)+1,floor(5*time[2*i+1]+11)+1);
    }
    return 0;
}
