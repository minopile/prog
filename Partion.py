

def partion(A,left,right):
	if left>=right:
		return
	pivot=A[right]
	p=left
	q=right
	while True:
		while A[q]>pivot:
			q-=1
		while A[p]<pivot:
			p+=1
		if p<q:
			A[p],A[q]=A[q],A[p]
		else : break
	A[q],pivot=pivot,A[q]
	return q

