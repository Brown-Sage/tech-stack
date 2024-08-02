#include<iostream>
using namespace std;
typedef union marks 
{
    int cgpa;
    char grade;
}student;
int main(){
    student aryan;
    aryan.grade='A';
    aryan.cgpa=93;
    cout<<aryan.cgpa<<endl;

return 0;
}