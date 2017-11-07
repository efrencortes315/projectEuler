import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class p13{
        public static void main(String[] args)
        {
                p13 self = new p13();
                ArrayList<BigInteger> nums =self.fileToArrList("listOfNums.txt");
                BigInteger sum = new BigInteger("0");
		for(int i= nums.size()-1;i>=0;i--){
                     sum = sum.add(nums.get(i));
                }
		System.out.println(sum.toString().substring(0,10));
        }
        public ArrayList<BigInteger> fileToArrList(String filename){

                ArrayList<String> list = new ArrayList<String>();
                ArrayList<BigInteger> nums = new ArrayList<BigInteger>();
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
                                nums.add(new BigInteger(list.get(i)));
                        }
                        catch(Exception e){
                                continue;
                        }
                }
                return nums;
        }

}
