#include <iostream>
#include <math.h>

using namespace std;

int sumOfDivisors(int num){
int dum=0;
for(int j=1;j<=num/2;j++){
if(num%j==0){
dum+=j;
}
}

return dum;

}



int main(){
int total = 0;

for(int i=1;i<10000;i++){
int sum= sumOfDivisors(i);
int rev = sumOfDivisors(sum);
if(sum==rev && sum!=0 && rev!=0){
total+=sum;
}

}
cout << total << endl;

return 0;
}

