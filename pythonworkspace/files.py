#Open a file

fo=open('text.txt','w')

print('Name is: ',fo.name)

print('Is closed: ',fo.closed)

print('file mode is : ', fo.mode)
#Write to file
fo.write('Hello Python')
fo.write(' and  Eclipse')
fo.close()

fo=open('text.txt','a')
fo.write(' How are you')
fo.close()
#Read from file
fo=open('text.txt','r+')
text=fo.read(10);
print(text)
fo.close()

#Make new file
fo=open('test2.txt','w+')
fo.write('Hello this is my 2nd file')
fo.close()

