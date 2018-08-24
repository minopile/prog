seq=input().split(' ')

A=list(map(lambda x:int (x),seq))
n=A[0]
del A[0]
print(n,A)


seq=input().split(' ')

B=list(map(lambda x:int (x),seq))
k=B[0]
del B[0]
print(n,B)

def binarysearch(A,left,right,x):
	if left>right:
		return -1
	mid=(left+right)//2
	if A[mid]==x:
		return mid
	if x<A[mid]:
		return binarysearch(A,left,mid-1,x)
	if x>A[mid]:
		return binarysearch(A,mid+1,right,x)



for x in B:
	print(binarysearch(A,0,len(A)-1,x), end=" ")