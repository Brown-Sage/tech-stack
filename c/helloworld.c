#include <stdio.h>
int main(){

    printf("hello world\n");   // a comment 
   

    int age = 21;
    float cgpa = 8.12;
    double pie = 3.144556543344567;
    char grade = 'a';
    char type [] = "cool";
    printf("my age is %d \n",age); //%d = int, %c for char, %s for string, %f for float
    printf("you are %s \n",type);
    printf("your cgpa is %f and grade is %c ",cgpa,grade); 
}