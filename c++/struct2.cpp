#include <iostream>
using namespace std;
struct name
{
    int age;
    char gender;
    float salary;

};
int main (){
    struct name aaryan;
    struct name gaurav;
    aaryan.age = 19;
    aaryan.gender = 'M';
    aaryan.salary = 100000;
    gaurav.age = 19;

    cout<<aaryan.salary<<endl<<gaurav.age<<endl<<aaryan.gender;

    return 0;


}
