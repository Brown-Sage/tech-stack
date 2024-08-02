#include<iostream>
using namespace std;
int bum(int a , int b){
    int c = a + b ;
    return c;
}
int main(){
int num1, num2;
cout<<"what is num1"<<endl;
cin>>num1;
cout<<"what is num2"<<endl;
cin>>num2;
cout<<bum(num1 , num2)<<endl;
return 0;
}