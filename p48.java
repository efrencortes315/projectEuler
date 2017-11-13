import java.math.BigInteger;
class p48{
	public static void main(String[] args){
	BigInteger last_ten_digs = new BigInteger("0");
	BigInteger mod = new BigInteger("10000000000");
	for(int i=1;i<=1000;i++){
		BigInteger pow = new BigInteger(Integer.toString(i));
		BigInteger num = pow.pow(i);
		num = num.mod(mod);
		last_ten_digs = last_ten_digs.add(num).mod(mod);
		
	}
	System.out.println(last_ten_digs);	
	}

}
