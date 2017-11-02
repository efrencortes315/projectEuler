#include <iostream>
#include <math.h>
#include <stdio.h>
using namespace std;
bool isPythTrip(int,int,int);
int main(){
	for(int i=0;i<1000;i++){
		for(int j=0;j<1000;j++){
			int temp = (i*i)+(j*j);
			if(isPythTrip(i,j,temp)){
				int orig = sqrt(temp);
				if(i+j+(orig)){
					cout << i*j*(orig) << endl;
				}
			}
		}
	}
	return 0;
}
bool isPythTrip(int a, int b, int c){
	a*=a;
	b*=b;
	c*=c;
	if(a+b==c){
		return true;
	}
	return false;
}
