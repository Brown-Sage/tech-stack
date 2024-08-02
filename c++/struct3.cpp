#include <iostream>
using namespace std;
struct animal
{
    int weight;
    char gender;
    float left;
};
int main (){
    struct animal tiger;
    struct animal bear;
    struct animal dinosour;
    tiger.weight=200;
    tiger.gender='f';
    tiger.left=108;
    dinosour.left=0;
    bear.weight=370;
    
    cout<<tiger.weight<<endl<<tiger.left<<endl<<dinosour.left<<endl<<bear.weight;

    return 0;
}