
def find_majority(A,left,right):

	if left>right:
		return -1
	elif  left==right or left+1==right:
		return A[left]

	mid=(left+right)//2
	majority1=find_majority(A,left,mid)
	majority2=find_majority(A,mid+1,right)
	majority=combine(A,left,right,majority1,majority2)

	return majority

def combine(A,left,right,majority1,majority2):

#	print('L',left,'R',right,'  m1',majority1,'m2',majority2)
#if both halfs has no majority return -1
	if majority1==-1 and majority2 == -1:
		return -1
#if both halfs has same majority value  return it 
	if majority1==majority2:
		return majority1
# if one half has majority. count in other half too and return it if >1/2 total else  -1
	if majority2 ==-1:
		count=0
		for x in range(left,right+1):
			if A[x]==majority1:
				count+=1
		if count>=(right+1-left)//2:
			return majority1
		else:
			return -1
	if majority1 ==-1:
		count=0
		for x in range(left,right+1):
			if A[x]==majority2:
				count+=1
		if count>=(right+1-left)//2:
			return majority2
		else:
			return -1
	else:# if majority 1 not eq majority2 count each and return max count . else return -1 if counts too equal
		count1,count2=0,0
		for x in range(left,right+1):
			if A[x]==majority1:
				count1+=1
			elif A[x]==majority2 :
				count2+=1
		if count1>count2:
			return majority1
		elif count1<count2:
			return majority2
		else:
			return -1


n=int(input())
seq=input().split(' ')
#using lambda to convert char(from se1) to int(to A)
A=list(map(lambda x:int(x),seq))

#program designed to return final majority value else -1
#but modified for coursera assignment to return 1 or 0
if find_majority(A,0,len(A)-1)!= -1:
	print(1)
else:
	print(0)