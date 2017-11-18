import java.math.BigInteger;

class p16
{
	public static void main(String[] args){

		BigInteger two = new BigInteger("2");
		BigInteger prod = two.pow(1000); 
		String sNum = prod.toString();
		String[] spl = sNum.split("(?!^)");
		int sum = 0;
		for( int i=0;i<sNum.length();i++){
			sum+=Integer.parseInt(spl[i]);
		}
		System.out.println(sum);
	}
}
