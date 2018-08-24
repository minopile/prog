num = int(input())
ans=0
while ans**3<num:
    ans+=1

if ans**3==num:
    print ("perfect cube")
else:
    print('no integer solution')
