#include<stdio.h>
#include<stdbool.h>
int main()
{
  int set[] = {3, 34, 4, 12, 5, 2};
  int sum = 9;
  int n = sizeof(set)/sizeof(set[0]);
  if (isSubsetSum(set, n, sum) == true)
     printf("Found a subset with given sum");
  else
     printf("No subset with given sum");
  return 0;
}
  isSubsetSum(set,n,sum){
if(sum==0)
    return true;
if(sum!=0&&n==0)
    return false;
if(set[n-1]>sum)
    return isSubsetSum(set,n-1,sum);

    return isSubsetSum(set,n-1,sum-set[n-1])||isSubsetSum(set,n-1,sum);

}
