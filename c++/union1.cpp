#include<iostream>
using namespace std;
typedef union thing 
{
    int watch;
    char word;
}th ;
int main(){
    th aryan ;

    aryan.watch = 1000;
    aryan.word ='F';
    cout<<aryan.watch<<endl;
return 0;
}