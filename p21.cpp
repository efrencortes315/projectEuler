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
bool isAmicable(int num){
int tmp = sumOfDivisors(num);
int two = sumOfDivisors(tmp);
if(two==num&& num!=tmp){
	return true;
}else{
return false;
}
}



int main(){
int total = 0;

for(int i=1;i<10000;i++){
if(isAmicable(i)){
total += i;
cout << i << endl;
}

}
cout << total << endl;

return 0;
}

