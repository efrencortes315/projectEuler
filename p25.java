import java.math.BigInteger;
class p25{

public static void main(String[] args){
	BigInteger a = new BigInteger("1");
	BigInteger b = new BigInteger("1");
	BigInteger c = a.add(b);
	int index = 3;
	while(c.toString().length()<1000){
		a= b;
		b=c;
		c=a.add(b);
		index++;
	}
	System.out.println(c.toString().length());
	System.out.println(index);
	
}

}
