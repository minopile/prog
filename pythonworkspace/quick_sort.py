arr=[12,4,2,9,23,22,15,0,10]

def partition(arr, i,j):

    p_index=j
    left=i 
    right=j-1
    while left<right:
        while arr[left]<arr[p_index]:
            left+=1
        while arr[right]>arr[p_index]:
            right-=1
        if right<=left:
            break
        arr[left],arr[right]=arr[right],arr[left]
        left+=1
        right-=1
    final_piv=right+1   
    arr[final_piv],arr[p_index]=arr[p_index],arr[final_piv]
    return final_piv

def quicksort(arr,i,j):
    if i<j:
        final_piv=partition(arr, i, j)
        quicksort(arr, i, final_piv-1)
        quicksort(arr, final_piv+1,j)
    

quicksort(arr, 0, 8)
print(arr)