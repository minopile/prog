/**
 * @input A : Read only ( DON'T MODIFY ) 2D integer array ' * @input n11 : Integer array's ( A ) rows
 * @input n12 : Integer array's ( A ) columns
 *
 * @Output Integer array. You need to malloc memory for result array, and fill result's length in length_of_array
 */

 #include<stdio.h>
 int main(){
 int A[3][2]={1,2,3,4,5,6};
  int *ary,i;
 int * result1;
 result1=spiralrder(A[3][2],3,2);
 for(i=0;i<6;i++)printf("%d",result1[i]);
return 0;
 }

int* spiralrder( int A[3][2], int n11, int n12) {
	 int length_of_array = n11 * n12; // length of result array
	 int *result = (int *) malloc(length_of_array * sizeof(int));
int total,p,i,j;
	total=(n11>n12)?(n12+1)/2:(n11+1)/2;
	for(p=0;p<=total;p++){
	    for(i=p;i<=(n12-1-p);i++){
	       // printf(A[p][n12-p-1]);
	        //printf(A[n11-p-1][n12-p-1]);
	   result[n11*p+i]=A[p][i];
	  result[(n11-p-1)*n11+i] =A[n11-p-1][i];
	    }

	    for(i=p+1;i<=(n11-2-p);i++){
	       // printf(A[i][n12-p-1]);
	        //printf(A[i][p]);
	    result[n12*i+n12-p-1]=A[i][n12-p-1];
	    result[n12*i+p]=A[i][p];

	         }

	}

	 return result;
}

