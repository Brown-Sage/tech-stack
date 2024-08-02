#include<iostream>
using namespace std;
struct name
{
    int age;
    int favchar;
    float salary;

};
int main(){
    struct name aaryan;
    struct name mayank;

    aaryan.favchar ='G';
    aaryan.age = 19;
    mayank.age=20;

    cout<<mayank.age<<endl<<aaryan.favchar;

    return 0;
}
          