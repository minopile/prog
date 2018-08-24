class Person:
    __email=''
    __name=''
    def __init__(self,name,email):
        self.__name=name
        self.__email=email
    def set_email(self,email):
        self.__email=email
    def set_name(self,name):
        self.__name=name
    def get_name(self):
        return self.__name
    def get_email(self):
        return self.__email
    def toString(self):
        return '{}can be contacted at {}'.format(self.__name, self.__email)
    
class Customer(Person):
    __balance =0
    def __init__(self,email,name,balance):
        self.__email=email
        self.__name=name
        self.__balance=balance
        super(Customer,self).__init__(name,email)
        __name=name
        __email=email
    def det_balance(self,balance):
        self.__balance=balance
    def toString(self):
        return '{}can be contachrts with balance {} at email address of {}'.format(self.__name,self.__balance,self.__email)
    
        
john=Customer('johndoe@gmail.com','john doe',300)
print (john.toString())
    


#Brad.set_email('brad@gmail.com')
#Brad.set_name('Brad Traversy')

#print(Brad.get_name())

'''Brad=Person('Braddy2','bradsemail2@gmail.com')

print(Brad.get_name());

print(Brad.toString())'''