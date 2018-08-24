A=[13,19,9,5,12,8,7,4,11,2,6,10]
print A

p=0
q=len(A)-1
piv=A[q]

def partion(A,left,right):
	if left>=right:return

	p=left
	q=right
	piv=A[q]
	while True:
		while  piv<A[q]:
			q-=1
		while piv> A[p]:
			p+=1
		if p<q:
			A[p],A[q]=A[q],A[p]
		else :return q



def qs(A,left,right):
	if left>=right:
		return
	pivot=partion(A,left,right)
	qs(A,left,pivot-1)
	qs(A,pivot+1,right)

qs(A,0,len(A)-1)	
print A
