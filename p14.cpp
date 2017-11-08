#include <iostream>
using namespace std;
long lenOfColChain(long);
int main(){
	long longest = 0;
	long longestnum = 1;
	for(long i=2;i<1000000;i++){
		long temp=lenOfColChain(i);
		longest<temp ? longestnum=i : longestnum=longestnum;
		longest<temp ? longest=temp : longest=longest;

	}
	cout << longestnum << " " << longest << endl;
	return 0;
}
long lenOfColChain(long dum){
	long len=1;
	long num=dum;
	while(num!=1){
		if(num%2==0){
			num/=2;
		}else{
			num=(3*num)+1;
		}	
		len++;
	}
	return len;
}
