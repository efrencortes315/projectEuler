import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
public class p10{
        public static void main(String[] args)
        {
                p10 self = new p10();
                ArrayList<Integer> nums =self.fileToArrList("primes1.txt");
                BigInteger sum= new BigInteger("0");
	
                for(int i=0;i< nums.size()-1;i++){
                        BigInteger prime = new BigInteger(nums.get(i).toString());
        	    
	            if(prime.compareTo(new BigInteger("2000000"))==-1){
	                        sum=sum.add(prime); 
                        }
                }
		System.out.println(sum);
        }
        public ArrayList<Integer> fileToArrList(String filename){
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
