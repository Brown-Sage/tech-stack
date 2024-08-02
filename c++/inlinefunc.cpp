#include <iostream>
using namespace std;

int sum(int a,int b){
    return a+b;
}

int main(){
    int a ,b;
    cout<<"what is a"<<endl;
    cin>>a;
    cout<<"what is b"<<endl;
    cin>>b;

    cout<<"answer is "<<sum(a,b);
    return 0;
}