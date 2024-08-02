#include <iostream>
using namespace std;
float calcSeriesSum(int n){
float sumVar = 0.00;
for(float i = 1; i <= n; i++){
 sumVar += (1/i);
   }
 return sumVar;
}
int main(){
int n = 7;
cout<<"The sum of series till "<<n<<" is "<<calcSeriesSum(n);
   return 0;
}