public class Quicks{
//swap method
    public static void swap(int[] arr,int left,int right){
int temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
}
    
    //partion method
public static int partition(int[] arr,int left,int right){
int pivot=right;
right--;
while(left<=right){
while(arr[left]<arr[pivot])left++;
while(arr[right]>arr[pivot])right--;

if(left<=right)
{
swap(arr,left,right);
left++;
right--;
}
}
swap(arr,left,pivot);
return right;
}
    //quicksort method
public static void quicksort(int[] arr,int left,int right){
if(left>=right) return;

int index=partition(arr,left,right);
quicksort(arr,left,index-1);
quicksort(arr,index+1,right);

}
    
    
public static void main(String[] args){
int[] arr={1,34,5,8,6,7,0,9,4,23,45,12,3};
int length=arr.length;
quicksort(arr,0,length-1);

for(int i=0;i<length;i++){
System.out.print(arr[i]+" ");
}

}
}