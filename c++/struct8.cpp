#include<iostream>
using namespace std;

struct name 
{
    int favnum;
    char gender;
    float salary;
};
int main(){
  struct name joni;
  struct name dhani;

  joni.favnum=9;
  dhani.gender='f';
 char b;
  b = dhani.gender ;

  cout<<joni.favnum<<endl;

  int x,y,c;
  
  
  cin>>x;
  cin>>y;
  c = x+y;
  cout<<c<<endl;
return 0;
}