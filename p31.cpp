#include <iostream>
using namespace std;
static int numWays=0;
void addCoint(int, int);


void addCoin(int curVal, int curCount){
int val = curVal;
int count = curCount;

if(val+1<200){
	count++;
	val++;
	addCoin(val,count);
}else if(val+1==200){
	count++;
	val++;
	numWays++;
	cout << count << endl;
}
}
int main(){
addCoin(0,0);
cout << numWays << endl;
}
