#include<iostream>
using namespace std;
int cum (int a, int b);
int main(){
int num1, num2 ;
num1 =2 ;
num2 = 3;
cout<<cum(num1,num2)<<endl;//actual parameters
return 0;
}
int cum(int a,int b){
    int c=a+b;//formal parameters
    return c;
}