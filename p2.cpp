#include <stdio.h>
#include <iostream>

using namespace std;
int nextFib(int,int);
int main(){
int a=1;
int b=1;
int sum=0;
int cur=nextFib(a,b);
 sum+=cur;
	while(cur<4000000){
		a=b;
		b=cur;
		cur=nextFib(a,b);
		if(cur<4000000 && cur%2==0){
			sum+=cur;	
		}
		
	}
cout << sum << endl;
return 0;
}
int nextFib(int s, int r){
	return (s+r);
}
