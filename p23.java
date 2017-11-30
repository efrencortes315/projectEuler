import java.util.*;
import java.util.ArrayList;
import java.math.BigInteger;
class p23{
public static void main(String[] args){
ArrayList<Integer> myList = makeList();
Set<Integer> sumsOfTwoAbund = new HashSet<Integer>();
for(int i=0;i<myList.size();i++){
	for(int j=0;j<myList.size();j++){
		sumsOfTwoAbund.add(myList.get(i)+myList.get(j));		
	}
}
BigInteger sum = new BigInteger("0");
for(int i=1;i<=28123;i++){
	if(!sumsOfTwoAbund.contains(i)){
		sum = sum.add(new BigInteger(Integer.toString(i)));	
	}
}
System.out.println(sum);
}
public static ArrayList<Integer> makeList(){
ArrayList<Integer> tmp = new ArrayList<Integer>();
for(int i=1;i<28123;i++){
	if(sumOfDivisors(i)>i){
		tmp.add(i);
	}
}
return tmp;
}

public static  int sumOfDivisors(int num){
	int sum=1;
	for(int i=2;i<Math.sqrt(num);i++){
		if(num%i==0){
		sum+=(i+((int)num/i));
		}
	}
	return sum;
}
}
