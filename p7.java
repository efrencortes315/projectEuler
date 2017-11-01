import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class p7{
public static void main(String[] args){
	ArrayList primes = fileToArrList("primes1.txt");
	System.out.println(primes.get(10000));
}
public static ArrayList<Integer> fileToArrList(String filename){
        ArrayList<String> list = new ArrayList<String>();
	ArrayList<Integer> nums = new ArrayList<Integer>();
        try{
        Scanner s = new Scanner(new File(filename));
        while(s.hasNext()){
		list.add(s.next());
        }
        s.close();
        }
        catch(FileNotFoundException e){
        	e.printStackTrace();
        }

        for(int i=0;i<list.size();i++){
        try{
        	nums.add(Integer.parseInt(list.get(i)));
        }
        catch(Exception e){
        	continue;
        }
        }
        return nums;
}
}
