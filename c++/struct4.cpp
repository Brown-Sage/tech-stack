#include<iostream>
using namespace std;
struct subject
{
    int level;
    char read ;

};
int main(){
    struct subject maths;
    struct subject eng;
    maths.level=8;
    eng.read='n';
    cout<<maths.level<<endl<<eng.read;
    return 0;
}