#include<iostream>
using namespace std;
int main(){
int number[]={1,34,56,78};
cout<<number[1]<<endl<<number[3]<<endl;

number[1]=35;           //here i changed the value of number
cout<<number[1]<<endl;

for ( int i = 0; i < 4; i++)
{
    cout<<number[i]<<endl;
}


return 0;
}