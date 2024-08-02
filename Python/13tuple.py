marks = (56,45,24,6,77,67) # () is not necessary in tuple and just use {} it will become set instead of tuple
print(marks.index(77))
#marks[0] = 0  # It wont work cuz item edit does not work in tuple unlike list

#print(marks)
for i in marks:
    print(i)