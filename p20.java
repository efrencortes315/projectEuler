import java.math.BigInteger; 
class p20 {
public static void main(String[] args){
BigInteger hund = new BigInteger("100");
BigInteger fact = new BigInteger("100");
for(int i=99;i>0;i--){
fact=fact.multiply(new BigInteger(Integer.toString(i)));

}
String sFact = fact.toString();
String[] digArr = sFact.split("");
int total = 0;
for(int i=0;i<digArr.length;i++){
total += Integer.parseInt(digArr[i]);
}
System.out.println(total);
}
}
