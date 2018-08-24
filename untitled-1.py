print "hello"

def fibs():
    num=input("enter a f number")
    result=[0,1]
    for i in range(num-2):
        result.append(result[-1]+result[-2])
        
    return result