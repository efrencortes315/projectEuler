#include <iostream>
using namespace std;

int main(){
	long INTEGER_MAX = 2147483647;
	for(long i=2520;i<INTEGER_MAX;i++){
		for(int j=1;j<21;j++){
			if(i%j!=0){
				j=21;
			}
			if(j==20){
				cout<< i << endl;
				j=21;
				i=INTEGER_MAX;
			}
			
			
			
		}
	}
	return 0;
}
