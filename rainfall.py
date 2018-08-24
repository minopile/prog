A=[12,5,6,23,0,9,2,4,7,8]

print A

L=0
R=len(A)-1
pivot=A[R]
left=L
right=R-1
while left<right:
	print A
	while A[left]<=pivot:
		left+=1
	while A[right]>=pivot:
		right-=1
	A[left],A[right]=A[right],A[left]


print left ,right