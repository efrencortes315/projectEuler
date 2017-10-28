
import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class p3{
	public static void main(String[] args)
	{
		BigInteger f = new BigInteger("600851475143");
		try{
		Scanner s = new Scanner(new File("primes1.txt"));
		ArrayList<String> list = new ArrayList<String>();
		while(s.hasNext()){
			
			list.add(s.next());
		}
		System.out.println("hellz yea");}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		System.out.println("succesful");
	}
}
