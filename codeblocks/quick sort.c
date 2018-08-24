#include<stdio.h>
void quicksort(int *,int ,int );
int main()
{
    int i;
    int arr[] = { 88,56,100,2,25,13,5,20,13,23,11,11,11};
    quicksort(arr,0,12);

    for(i=0; i<13; i++)
        printf("%d  ",arr[i]);
    return 0;

}


void swapy(int *arr,int i,int j)
{
    int temp;
    temp=arr[j];
    arr[j]=arr[i];
    arr[i]=temp;
}

void quicksort(int *arr,int start,int endy)
{
    puts("\n");
    if(start>=endy)
        return;
    int pivot,index,i,j;
    index=start;
    pivot=arr[endy];
    for(i=start; i<=endy-1; i++)
    {
        if(arr[i]<pivot)
        {
            swapy(arr,index,i);
            index++;
        }
        printf("%d ",arr[i]);

    }
swapy(arr,index,endy);
        quicksort(arr,start,index-1);
        quicksort(arr,index+1,endy);

}
