x=input("enter int")
y=True
while(y):

	if (x==1):
		y=False
		print x
		continue

	if (x%2==0):
		x=x/2
		print x
		continue

	if(x%2!=0):

		x=3*x+1
		print x

		continue

	




