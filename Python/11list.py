marks = [97,82,65]
# marks[0] = 10
marks.append(98)
marks.append(78)
marks.insert(1, 34) # For inserting a number in middle 
'''print(marks[1])
print(marks[0:2])'''
print(34 in marks) # To check if this value exist in the list or not
print(67 in marks)
#print(marks.count(65)) #For counting that how much times a number occured

#with for loop
i = 0
for i in range (len(marks)): #len() is a method for calc the total numbers 
    print(marks[i])
print( )
print( )
print( )
print( )

#WITH WHILE LOOP
i = 0         
while i < len(marks):
    print(marks[i])
    i = i+1

