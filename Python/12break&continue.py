'''marks = [97,82,65]

marks.append(98)
marks.append(78)
marks.insert(1, 34)
i = 0
for i in range(len(marks)):
    if marks[i] == 98:
        break;
    print(marks[i])'''

students = ["aaryan", "krishna", "vishrut", "yash"]

'''i = 0
for i in range(len(students)):
    if students[i] == "yash":
        break;
    print(students[i])'''
for student in students:
    if student == "vishrut":
        break;
    print(student)