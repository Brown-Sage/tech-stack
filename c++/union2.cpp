#include<iostream>
using namespace std;
union money
{
    int rs ;
    char word;
};
int main(){

    union money car;

    car.rs = 100000;
    car.word = 's';
    cout<<car.word<<endl;

return 0;
}