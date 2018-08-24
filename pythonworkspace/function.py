def sayHello(name='John'):
    print('Hello',name)
    'print hello in function'
    
sayHello('Sai')


def numSum(num1,num2):
    total=num1+num2
    return total

print(numSum(1,4))

num=5
def addOneToNum(num):
    num=num+1
    print('num inside function', num)
    return 
print('num outside function',num)
    
    
myList=[1,2,3]

def addNumToList(myList):
    myList.append(4)
    print('list inside function', myList)
    return 
addNumToList(myList)
print('num outside function',myList)
