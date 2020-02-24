package lab3;

import java.util.Arrays;
import java.util.HashMap;

public class Lab3Ex1{
	public int getSecondSmallest(int array[]){
		boolean swapped=true;
		int j=0;
        int tmp;
	    while (swapped){
	    	swapped=false;
		    j++;
		    for(int i=0;i<array.length-j;i++){
		            if(array[i]>array[i+1]){
		                tmp=array[i];
		                array[i]=array[i+1];
		                array[i+1]=tmp;
		                swapped=true;
		                }
		            }
		    }
	    return array[array.length-2];
	    }
	public String[] getSorted(String array[]){
			for(int i=0;i<array.length;i++){
				for(int j=1;j<array.length;j++){
					if(array[j-1].compareTo(array[j])>0){
	                    String temp=array[j-1];
	                    array[j-1]=array[j];
	                    array[j]=temp;
	                    }
					}
				}
			int flag;
			if(array.length%2==0)
				flag=array.length/2;
			else
				flag=array.length/2+1;
			
			for(int i=0;i<=flag;i++)
				array[i].toUpperCase();
			for(int i=flag+1;i<array.length;i++)
				array[i].toLowerCase();
			
			return array;
			}
	public int[] getReverseSorted(int[] arr){
			for(int i=0;i<arr.length;i++){
				String num=Integer.toString(arr[i]);
				StringBuffer number=new StringBuffer(num);
				number.reverse();
				arr[i]=Integer.parseInt(number.toString());
				System.out.println(arr[i]);
			}
			Arrays.sort(arr);
			return arr;
		}
		public HashMap<String, Integer> countChar(char[] arr){
			HashMap<String,Integer> count=new HashMap<String,Integer>();
			for(char a:arr) {
				String s=String.valueOf(a);
				if(count.containsKey(s)) 
					count.put(s, count.get(s) + 1);
				else 
					count.put(s,1);
			}
			
			return(count);
		}

}
