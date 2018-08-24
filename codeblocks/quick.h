#ifndef QUICK_H_INCLUDED
#define QUICK_H_INCLUDED


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
void swapy(int *arr,int i,int j)
{
    int temp;
    temp=arr[j];
    arr[j]=arr[i];
    arr[i]=temp;
}

#endif // QUICK_H_INCLUDED
