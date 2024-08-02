#include<iostream>
using namespace std;
int cum(int a, int b){
    int c = a * b;
    return c;
}
int main(){
    int x , y;
    x = 3;
    y =7;
    cout<<cum(x,y)<<endl;
return 0;
}