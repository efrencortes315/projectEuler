import java.util.*;
import java.util.ArrayList;
class p23{
public static void main(String[] args){
ArrayList<Integer> myList = makeList();

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
		System.out.println(sum + " " + num/i);
		sum+=(i+((int)num/i));
		}
	}
	return sum;
}
}
