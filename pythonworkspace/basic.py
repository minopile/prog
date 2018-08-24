myFloat=1.3
myList=[1,3,4,'eee']
myDict={'a':1, 'b':2,'c':3}


print(type(myFloat),myFloat)

print(type(myDict), myDict)

x=4
if x<4:
    print('this is true')
else:
    print('this is false')
    

color='red'
if color=='red':
    print('color is red')
elif color== 'blue':
    print('color is blue')
else:
    print('color not red or blue')
    
if color=='red':
    if x<10:
        print('color is red and x < 4')
        
if color=='red' and x<10:
    print("true")


people=['xyzz','pqrr','abcc']

for person in people:
    print("person name is", person)
    
for x in range(12):
    print("x is=",x)
    
count=0
while count<10:
    print("Count is :", count)
    count=count+1
    if count==5:
        break