from Partion import partion

A=[13,19,9,5,12,8,7,4,11,2,6,10]


def kstat(A,p,r,k):

	if p==r : return A[p]
	q=partion(A,p,r)
	k1=q-p+1
	if k1==k:
		return A[q]
	if k<k1 :
		return kstat(A,p,q-1,k)
	else :
		return kstat(A,q+1,r,k-k1)

print kstat(A,0,len(A)-1,5)

