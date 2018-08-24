#include<stdio.h>
int main()
{
    int index[]= {1,0,4,2,3};
    int arr[]= {12,45,16,90,3};
    int i,j,temp_val=arr[0],temp_index;
    j=0;

    for(i=0; i<5; i++)
    {
        if(index[j]==j)
        { j++;
        }

        if(j!=index[j]){
        temp_val=arr[j];
        temp_index=index[j];
        arr[j]=arr[index[j]];
        j=index[j];
        arr[j]=temp_val;

    }

    #include<stdio.h>
    int main()
{
    int arr[] = {50, 40, 70, 60, 90};
    int index[] = {3,  0,  4,  1,  2};
    int n = sizeof(arr)/sizeof(arr[0]);

    reorder(arr, index, n);

    printf( "Reordered array is: \n");
    for (int i=0; i<n; i++)
        printf("%d ",arr[i]);

   printf( "Reordered index is: \n");
    for (int i=0; i<n; i++)
       printf("%d ",index[i]);
    return 0;
}
    }


    for(i=0; i<5; i++)
        printf("%d  ",arr[i]);

    return 0;
}
