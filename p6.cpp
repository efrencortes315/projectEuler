#include <iostream>
using namespace std;

int main(){
	long sum_of_squares = 0;
	for(int i=0;i<=100;i++){
		sum_of_squares += (i*i);	
	}
	long square_of_sums=0;
	for(int i=0;i<=100;i++){
		square_of_sums+=i;
	}
	square_of_sums*=square_of_sums;
	long output= square_of_sums<sum_of_squares ? sum_of_squares-square_of_sums : square_of_sums-sum_of_squares;
	cout << output << endl;
	return 0;
}
