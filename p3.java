
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
		p3 self = new p3();
		ArrayList<Integer> nums =self.fileToArrList("primes1.txt");
		System.out.println(nums.size());
		for(int i= nums.size()-1;i>=0;i--){
			BigInteger prime = new BigInteger(nums.get(i).toString());
			if(f.mod(prime).equals(0)){
				System.out.println(prime.toString());
				break;
			}
		}
	}
	public ArrayList<Integer> fileToArrList(String filename){
		/*		
		import java.math.BigInteger;
		import java.util.Scanner;
		import java.util.ArrayList;
		import java.io.BufferedInputStream;
		import java.io.DataInputStream;
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		*/
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
