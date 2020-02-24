package lab6;
import java.io.*;
public class Lab6Ex6{
	public static void main(String args[]) throws IOException{
		try
		{
			int lines=0,character=0,words=0,code=0;
			FileInputStream in=new FileInputStream("System.in");
			while(in.available()!=0){
				code=in.read();
				if(code!=10)
					character++;
				if(code==32)
					words++;
			     if(code==13){
			    	 lines++;
			         words++;
			         }
			     }
			System.out.println("No.of characters = "+character);
            System.out.println("No.of words = "+(words+1));
            System.out.println("No.of lines = "+(lines+1));
            in.close();
            }
		catch(FileNotFoundException e){
			System.out.println("File not found...");
			}
		}
 }

