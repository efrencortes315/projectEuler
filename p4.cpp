#include <iostream>
#include <limits.h>
#include <string>
#include <algorithm>
#include <sstream>

using namespace std;
bool isPalindrome(int);
bool isPalindrome(int num){
	stringstream ss;
	ss << num;
	string sNum= ss.str();
	string rNum= sNum;
	reverse(rNum.begin(),rNum.end());
	if(sNum == rNum){
		return true;
	}else{
		return false;	
	}
       /* unsigned int number_of_digits = 0;
        int n = num;
        do {
        ++number_of_digits;
         n /= 10;

        } while (n);
        int size[number_of_digits];
        n=num;
        for(int i=0;i<number_of_digits;i++){
                size[i]= n%10;
                n/=10;
        }
        for(int i=0;i<=number_of_digits/2;i++){
                if(size[i]!=size[number_of_digits-i-1]){
                        return false;
                }
                return true;
        }
        cout << endl;*/
}

int main(){
	cout << "calculating..." << endl;
	int largest=0;
	for(int i=999;i>0;i--){
		for(int j=999;j>0;j--){
			int prod = i*j;
			if(isPalindrome(prod)&& prod > largest){
				largest=prod;
						
			}
		}	
	}
	cout << "the answer is: " << largest << endl;
	return 0;
}

